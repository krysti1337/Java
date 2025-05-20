package com.example.Banking.Accounts.Interface;

import java.time.LocalDate;

public interface InterfaceCustomer {
    String getCustomerId();
    String getCustomerTypeCode();
    String getName();
    String getEmail();
    LocalDate getDateBecameCustomer();

    boolean isActive();
}
