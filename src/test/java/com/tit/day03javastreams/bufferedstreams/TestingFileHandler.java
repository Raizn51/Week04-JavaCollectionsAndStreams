package com.tit.day03javastreams.bufferedstreams;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingFileHandler to test file handling operations
class TestingFileHandler
{

    // Test method for copying file contents using buffered streams
    @Test
    void testCopyFileUsingBufferedStreams() throws IOException {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Create temporary source and destination files
        File sourceFile = new File("src/main/resources/test_input.txt");
        File destinationFile = new File("src/main/resources/test_output_buffered.txt");

        // Write some content to the source file
        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write("This is a test.");
        }

        // Copy the file using buffered streams
        long timeTaken = fileHandler.copyFileUsingBufferedStreams(sourceFile.getPath(), destinationFile.getPath());

        // Read the contents of the destination file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(destinationFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        // Expected content
        String expectedContent = "This is a test.";

        // Asserting the file content and print the time taken
        assertTrue(content.toString().equals(expectedContent));
        System.out.println("Buffered Streams Time: " + timeTaken + " ns");
    }

    // Test method for copying file contents using unbuffered streams
    @Test
    void testCopyFileUsingUnbufferedStreams() throws IOException
    {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Create temporary source and destination files
        File sourceFile = new File("src/main/resources/test_input.txt");
        File destinationFile = new File("src/main/resources/test_output_unbuffered.txt");

        // Write some content to the source file
        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write("This is a test.");
        }

        // Copy the file using unbuffered streams
        long timeTaken = fileHandler.copyFileUsingUnbufferedStreams(sourceFile.getPath(), destinationFile.getPath());

        // Read the contents of the destination file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(destinationFile)))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        // Expected content
        String expectedContent = "This is a test.";

        // Asserting the file content and print the time taken
        assertTrue(content.toString().equals(expectedContent));
        System.out.println("Unbuffered Streams Time: " + timeTaken + " ns");

        // Clean up temporary files
        sourceFile.delete();
        destinationFile.delete();
    }
}

