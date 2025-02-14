package com.tit.day05javaexceptionhandling.checkedexception;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFileHandler to test file handling operations
class TestingFileHandler
{

    // Test method for reading file contents
    @Test
    void testReadFile() throws IOException {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Create temporary test file
        File testFile = new File("src/main/resources/TestData.txt");

        // Write some content to the test file
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("This is a test.\nLine 2.\n");
        }

        // Redirecting System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Read the file
        fileHandler.readFile(testFile.getPath());

        // Expected output
        String expectedOutput = "This is a test.\r\nLine 2.\r\n";
        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());

        // Clean up temporary test file
        testFile.delete();
    }
}
