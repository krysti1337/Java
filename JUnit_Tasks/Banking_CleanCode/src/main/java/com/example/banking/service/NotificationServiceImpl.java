package com.example.banking.service;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void notify(String customerId, String message) {
        System.out.println("Notifying customer [" + customerId + "]: " + message);
    }
}