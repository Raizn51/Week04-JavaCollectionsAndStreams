package com.tit.day05javaexceptionhandling.throwvsthrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Creating a class TestingInterestCalculator to test interest calculation operations
class TestingInterestCalculator
{

    // Test method for valid input
    @Test
    void testValidInput()
    {
        // Creating an object of InterestCalculator
        InterestCalculator calculator = new InterestCalculator();
        // Valid input values
        double amount = 1000;
        double rate = 5;
        int years = 2;
        // Expected interest calculation
        double expectedInterest = 100.0;
        // Asserting the calculated interest
        assertEquals(expectedInterest, calculator.calculateInterest(amount, rate, years));
    }

    // Test method for invalid input (negative amount)
    @Test
    void testNegativeAmount() {
        // Creating an object of InterestCalculator
        InterestCalculator calculator = new InterestCalculator();
        // Invalid input values
        double amount = -1000;
        double rate = 5;
        int years = 2;
        // Asserting the exception
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateInterest(amount, rate, years);
        });
    }

    // Test method for invalid input (negative rate)
    @Test
    void testNegativeRate() {
        // Creating an object of InterestCalculator
        InterestCalculator calculator = new InterestCalculator();
        // Invalid input values
        double amount = 1000;
        double rate = -5;
        int years = 2;
        // Asserting the exception
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateInterest(amount, rate, years);
        });
    }
}
