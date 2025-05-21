package com.example.stock;


import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "stock", uniqueConstraints = {
        @UniqueConstraint(columnNames = "STOCK_NAME"),
        @UniqueConstraint(columnNames = "STOCK_CODE")
})
public class Stock implements java.io.Serializable {

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private StockDetail stockDetail;

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Stock(String stockCode, String stockName, StockDetail stockDetail) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.stockDetail = stockDetail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_seq")
    @SequenceGenerator(name = "stock_seq", sequenceName = "STOCK_SEQ", allocationSize = 1)
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    public Integer getStockId() {
        return stockId;
    }

    @Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
    public String getStockCode() {
        return stockCode;
    }

    @Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
    public String getStockName() {
        return stockName;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "stock", cascade = CascadeType.ALL)
    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }
}
