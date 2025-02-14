package com.tit.day05javaexceptionhandling.nestedtrycatchblock;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingArrayDivisionHandler to test array division operations
class TestingArrayDivisionHandler
{
    // Test method for valid division
    @Test
    void testValidDivision() {
        // Mock user input with valid division
        ByteArrayInputStream in = new ByteArrayInputStream("2\n5\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of ArrayDivisionSimulation
        ArrayDivisionSimulation.main(new String[]{});

        // Expected output for valid division
        String expectedOutput = "Enter the index number: Enter the divisor: Result: 6\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for invalid array index
    @Test
    void testInvalidArrayIndex() {
        // Mock user input with invalid array index
        ByteArrayInputStream in = new ByteArrayInputStream("10\n5\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of ArrayDivisionSimulation
        ArrayDivisionSimulation.main(new String[]{});

        // Expected output for invalid array index
        String expectedOutput = "Enter the index number: Enter the divisor: Invalid array index!\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for division by zero
    @Test
    void testDivisionByZero() {
        // Mock user input with division by zero
        ByteArrayInputStream in = new ByteArrayInputStream("2\n0\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of ArrayDivisionSimulation
        ArrayDivisionSimulation.main(new String[]{});

        // Expected output for division by zero
        String expectedOutput = "Enter the index number: Enter the divisor: Cannot divide by zero!\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }
}
