package com.tit.day03javastreams.readalargefilelinebyline;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingLargeFileReader to test file reading operations
class TestingLargeFileReader {

    // Test method for reading file and printing lines containing the word "error"
    @Test
    void testReadFileAndPrintErrorLines() throws IOException {
        // Creating an object of LargeFileReader
        LargeFileReader fileReader = new LargeFileReader();

        // Create a temporary file with test content
        File testFile = new File("src/main/resources/test_largefile.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write("This is a test line.\n");
            writer.write("This line contains an Error.\n");
            writer.write("Another test line with no issues.\n");
            writer.write("Here is another error line.\n");
        }

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Reading the file and printing lines containing "error"
        fileReader.readFileAndPrintErrorLines(testFile.getPath());

        // Restoring the original System.out
        System.setOut(oldOut);

        // Expected output
        String expectedOutput = "This line contains an Error.\nHere is another error line.\n";

        // Asserting the output
        assertTrue(outputStream.toString().contains(expectedOutput));

        // Clean up temporary file
        testFile.delete();

        System.out.println("Large File Reader Test Passed");
    }
}
