package com.tit.day05javaexceptionhandling.multiplecatchblocks;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingArrayHandler to test array operations
class TestingArrayHandler {

    // Test method for valid index
    @Test
    void testValidIndex() {
        // Mock user input with valid index
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of ArrayOperationsSimulation
        ArrayOperationsSimulation.main(new String[]{});

        // Expected output for valid index
        String expectedOutput = "Enter the index number: Value at index 2: 3\r\n";
        assertEquals(expectedOutput, outContent.toString()); // Assert the output
    }

    // Test method for index out of bounds
    @Test
    void testIndexOutOfBounds() {
        // Mock user input with invalid index
        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method of ArrayOperationsSimulation
        ArrayOperationsSimulation.main(new String[]{});

        // Expected output for invalid index
        String expectedOutput = "Enter the index number: Invalid index!\r\n";
        assertEquals(expectedOutput, outContent.toString()); // Assert the output
    }

    // Test method for null array
    @Test
    void testNullArray() {
        // Mock user input with valid index
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Creating an object of ArrayHandler and passing null array
        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.getValueAtIndex(null, 2);

        // Expected output for null array
        String expectedOutput = "Array is not initialized!\r\n";
        assertEquals(expectedOutput, outContent.toString()); // Assert the output
    }
}
