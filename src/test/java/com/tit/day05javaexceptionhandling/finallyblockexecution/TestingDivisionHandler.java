package com.tit.day05javaexceptionhandling.finallyblockexecution;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingDivisionHandler to test division operations
class TestingDivisionHandler {

    // Test method for valid division
    @Test
    void testValidDivision() {
        // Mock user input with valid division
        ByteArrayInputStream in = new ByteArrayInputStream("10\n2\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of DivisionSimulation
        DivisionSimulation.main(new String[]{});

        // Expected output for valid division
        String expectedOutput = "Enter the numerator: Enter the denominator: Result: 5\r\nOperation completed\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for division by zero
    @Test
    void testDivisionByZero() {
        // Mock user input with division by zero
        ByteArrayInputStream in = new ByteArrayInputStream("10\n0\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of DivisionSimulation
        DivisionSimulation.main(new String[]{});

        // Expected output for division by zero
        String expectedOutput = "Enter the numerator: Enter the denominator: Error: Division by zero is not allowed.\r\nOperation completed\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }
}
