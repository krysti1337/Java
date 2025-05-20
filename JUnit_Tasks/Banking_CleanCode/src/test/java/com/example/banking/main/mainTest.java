package com.example.banking.main;

import com.example.banking.Main;
import org.junit.jupiter.api.Test;

public class mainTest {
    @Test
    void shouldRunMainWithoutErrors() {
        Main.main(new String[]{});
        // No assertion - runs the flow to cover main method.
    }
}
