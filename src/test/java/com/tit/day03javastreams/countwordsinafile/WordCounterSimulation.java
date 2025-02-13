package com.tit.day03javastreams.countwordsinafile;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingWordCounter to test word counting operations
class TestingWordCounter
{

    // Test method for counting words and displaying top 5 most frequent words
    @Test
    void testCountWordsAndDisplayTop5() throws IOException {
        // Creating an object of WordCounter
        WordCounter wordCounter = new WordCounter();

        // Create a temporary file with test content
        File testFile = new File("test_input.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write("Error in line 1.\n");
            writer.write("Another error occurred.\n");
            writer.write("This is a test line.\n");
            writer.write("Error found in the system.\n");
            writer.write("System has no errors.\n");
        }

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Counting words and displaying the top 5 most frequent words
        wordCounter.countWordsAndDisplayTop5(testFile.getPath());

        // Restoring the original System.out
        System.setOut(oldOut);

        // Expected output
        String expectedOutput = "error: 3\nin: 2\nsystem: 2\nline: 1\nanother: 1\n";

        // Asserting the output
        assertEquals(expectedOutput, outputStream.toString().toLowerCase().replaceAll("[^a-z0-9\n]", ""));

        // Clean up temporary file
        testFile.delete();

        System.out.println("Word Counter Test Passed");
    }
}
