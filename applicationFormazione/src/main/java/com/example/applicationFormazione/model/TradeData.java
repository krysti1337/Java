package com.example.applicationFormazione.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "trade_data")
public class TradeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String timeRef;
    private String account;
    private String code;
    private String countryCode;
    private String productType;
    private BigDecimal value;
    private String status;

    // Getteri si setteri


    public TradeData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimeRef() {
        return timeRef;
    }

    public void setTimeRef(String timeRef) {
        this.timeRef = timeRef;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
