package com.example.applicationFormazione.batch;

import com.example.applicationFormazione.model.TradeData;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.validation.BindException;

@Configuration
public class BatchConfig {

    private final EntityManagerFactory entityManagerFactory;

    public BatchConfig(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Bean
    public Job importJob(JobRepository jobRepository, Step step, JobCompletionNotificationListener listener) {
        return new JobBuilder("importCsvJob", jobRepository)
                .start(step)
                .listener(listener)
                .build();
    }

    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step", jobRepository)
                .<TradeData, TradeData>chunk(1000, transactionManager)
                .reader(reader())
                .writer(writer())
                .build();
    }

    @Bean
    public FlatFileItemReader<TradeData> reader() {
        FlatFileItemReader<TradeData> reader = new FlatFileItemReader<>();
        reader.setResource(new ClassPathResource("output_csv_full.csv"));
        reader.setLinesToSkip(1);
        reader.setStrict(false);

        DefaultLineMapper<TradeData> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setDelimiter(","); // sau auto
        tokenizer.setNames("timeRef", "account", "code", "countryCode", "productType", "value", "status");

        BeanWrapperFieldSetMapper<TradeData> fieldSetMapper = new BeanWrapperFieldSetMapper<>() {
            @Override
            public TradeData mapFieldSet(FieldSet fs) throws BindException {
                TradeData td = super.mapFieldSet(fs);
                td.setId(null); // fortam INSERT, nu MERGE
                return td;
            }
        };
        fieldSetMapper.setTargetType(TradeData.class);

        lineMapper.setLineTokenizer(tokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);

        reader.setLineMapper(lineMapper);
        return reader;
    }

    @Bean
    public JpaItemWriter<TradeData> writer() {
        JpaItemWriter<TradeData> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
}
