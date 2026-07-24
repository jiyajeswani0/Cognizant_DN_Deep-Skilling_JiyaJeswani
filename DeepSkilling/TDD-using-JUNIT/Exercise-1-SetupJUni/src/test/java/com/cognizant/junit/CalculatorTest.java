package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(20, 4));
    }
}