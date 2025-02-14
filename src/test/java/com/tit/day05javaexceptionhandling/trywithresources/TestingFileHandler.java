package com.tit.day05javaexceptionhandling.trywithresources;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFileHandler to test file handling operations
class TestingFileHandler {

    // Test method for reading the first line of a file
    @Test
    void testReadFirstLine() throws IOException {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Create temporary test file
        File testFile = new File("test_info.txt");

        // Write some content to the test file
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("This is the first line.\nThis is the second line.");
        }

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Read the first line of the test file
        fileHandler.readFirstLine(testFile.getPath());

        // Expected output for the first line
        String expectedOutput = "First line: This is the first line.\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());

        // Clean up temporary test file
        testFile.delete();
    }

    // Test method for handling file not found
    @Test
    void testFileNotFound() {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Read a non-existent file
        fileHandler.readFirstLine("non_existent_file.txt");

        // Expected output for file not found
        String expectedOutput = "Error reading file\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }
}
