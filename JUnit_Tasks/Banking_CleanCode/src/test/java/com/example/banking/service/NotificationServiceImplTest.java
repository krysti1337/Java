package com.example.banking.service;


import org.junit.jupiter.api.Test;

/*
Simplu, doar sysout, dar îl acoperim tot
 */
public class NotificationServiceImplTest {

    @Test
    void shouldPrintNotification(){
        NotificationServiceImpl service = new NotificationServiceImpl();
        service.notify("1", "Test message");
    }
}
