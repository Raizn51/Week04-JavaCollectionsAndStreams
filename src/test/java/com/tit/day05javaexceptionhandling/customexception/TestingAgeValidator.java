package com.tit.day05javaexceptionhandling.customexception;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingAgeValidator to test age validation operations
class TestingAgeValidator
{
    // Test method for valid age input
    @Test
    void testValidAge()
    {
        // Mock user input with valid age
        ByteArrayInputStream in = new ByteArrayInputStream("20".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of AgeValidationSimulation
        AgeValidationSimulation.main(new String[]{});

        // Expected output for valid age input
        String expectedOutput = "Enter your age: Access granted!\n";
        assertEquals(expectedOutput, outContent.toString()); // Assert the output
    }

    // Test method for invalid age input
    @Test
    void testInvalidAge()
    {
        // Mock user input with invalid age
        ByteArrayInputStream in = new ByteArrayInputStream("15".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of AgeValidationSimulation
        AgeValidationSimulation.main(new String[]{});

        // Expected output for invalid age input
        String expectedOutput = "Enter your age: Age must be 18 or above\n";
        assertEquals(expectedOutput, outContent.toString()); // Assert the output
    }
}
