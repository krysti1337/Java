package com.example.banking.validation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
(Business Logic simplă → fără Mockito)
 */

public class TransactionValidatorTest {

    private final TransactionValidator validator = new TransactionValidator();

    @Test
    void validAmountShouldReturnTrue(){
        assertTrue(validator.isValidAmount(100.0));
    }

    @Test
    void zeroAmountShouldReturnFalse(){
        assertFalse(validator.isValidAmount(0.0));
    }

    @Test
    void negativeAmountShouldReturnFalse(){
        assertFalse(validator.isValidAmount(-50.0));
    }
}
