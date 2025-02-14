package com.tit.day05javaexceptionhandling.uncheckedexception;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingDivisionHandler to test division operations
class TestingDivisionHandler
{

    // Test method for valid division
    @Test
    void testValidDivision()
    {
        DivisionHandler divisionHandler = new DivisionHandler();

        // Mock user input
        ByteArrayInputStream in = new ByteArrayInputStream("10\n2\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Perform the division
        divisionHandler.divideNumbers();

        // Expected output
        String expectedOutput = "Enter the numerator: Enter the denominator: Result: 5\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for division by zero
    @Test
    void testDivisionByZero()
    {
        DivisionHandler divisionHandler = new DivisionHandler();

        // Mock user input
        ByteArrayInputStream in = new ByteArrayInputStream("10\n0\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Perform the division
        divisionHandler.divideNumbers();

        // Expected output
        String expectedOutput = "Enter the numerator: Enter the denominator: Error: Division by zero is not allowed.\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for non-numeric input
    @Test
    void testNonNumericInput()
    {
        DivisionHandler divisionHandler = new DivisionHandler();

        // Mock user input
        ByteArrayInputStream in = new ByteArrayInputStream("10\nabc\n".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Perform the division
        divisionHandler.divideNumbers();

        // Expected output
        String expectedOutput = "Enter the numerator: Enter the denominator: Error: Please enter numeric values only.\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }
}
