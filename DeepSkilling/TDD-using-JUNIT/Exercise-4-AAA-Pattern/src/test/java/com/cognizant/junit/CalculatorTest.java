package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleanup completed");
    }

    @Test
    void testAdd() {
        // Arranging
        int a = 15;
        int b = 5;

        // Perform Act
        int result = calculator.add(a, b);

        // Perform Assert
        assertEquals(20, result);
    }

    @Test
    void testSubtract() {
        // Arrange
        int a = 20;
        int b = 8;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(12, result);
    }
}