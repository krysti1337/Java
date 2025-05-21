package com.example.stock;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock_detail")
public class StockDetail implements java.io.Serializable{

    private Integer stockId;
    private Stock stock;
    private String compName;
    private String compDesc;
    private String remark;
    private Date listedDate;

    public StockDetail() {
    }

    public StockDetail(Stock stock, String compName, String compDesc,
                       String remark, Date listedDate) {
        this.stock = stock;
        this.compName = compName;
        this.compDesc = compDesc;
        this.remark = remark;
        this.listedDate = listedDate;
    }

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "stock"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    public Integer getStockId(){
        return this.stockId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Stock getStock() {
        return stock;
    }

    @Column(name = "COMP_NAME", nullable = false, length = 100)
    public String getCompName() {
        return compName;
    }

    @Column(name = "COMP_DESC", nullable = false)
    public String getCompDesc() {
        return compDesc;
    }

    @Column(name = "REMARK", nullable = false)
    public String getRemark() {
        return remark;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LISTED_DATE", nullable = false, length = 10)
    public Date getListedDate() {
        return listedDate;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }
}
