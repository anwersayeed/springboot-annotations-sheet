package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // Boots full application context
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test // Marks this method as a test
    public void testAddition() {
        int result = calculatorService.add(5, 7);
        assertEquals(12, result); // Verifies expected behavior
    }
}
