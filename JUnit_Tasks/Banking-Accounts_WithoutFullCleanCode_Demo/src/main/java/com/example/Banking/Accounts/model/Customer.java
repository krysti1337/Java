package com.example.Banking.Accounts.model;

import com.example.Banking.Accounts.Interface.InterfaceCustomer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Customer implements InterfaceCustomer {

    private String customerId;
    private String customerTypeCode;
    private String name;
    private String email;
    private LocalDate dateBecameCustomer;

    public Customer() {
    }

    public Customer(String customerId, String customerTypeCode, String name, String email, LocalDate dateBecameCustomer) {
        this.customerId = customerId;
        this.customerTypeCode = customerTypeCode;
        this.name = name;
        this.email = email;
        this.dateBecameCustomer = dateBecameCustomer;
    }

    public boolean isActive() {
        return dateBecameCustomer != null &&
                dateBecameCustomer.isBefore(LocalDate.now());
    }
}
