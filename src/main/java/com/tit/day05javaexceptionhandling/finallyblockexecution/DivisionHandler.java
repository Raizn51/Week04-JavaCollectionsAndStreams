package com.tit.day05javaexceptionhandling.finallyblockexecution;

// Creating a class DivisionHandler to handle division operations
public class DivisionHandler {

    // Method to perform division and demonstrate finally block execution
    public void performDivision(int numerator, int denominator) {
        try {
            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block always executes
            System.out.println("Operation completed");
        }
    }
}
