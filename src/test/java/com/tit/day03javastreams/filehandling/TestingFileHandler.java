package com.tit.day03javastreams.filehandling;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFileHandler to test file handling operations
class TestingFileHandler
{

    // Test method for copying file contents
    @Test
    void testCopyFile() throws IOException
    {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Create temporary source and destination files
        File sourceFile = new File("src/main/resources/test_input.txt");
        File destinationFile = new File("src/main/resources/test_output.txt");

        // Write some content to the source file
        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write("This is a test.");
        }

        // Copy the file
        fileHandler.copyFile(sourceFile.getPath(), destinationFile.getPath());

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

        // Asserting the file content
        assertEquals(expectedContent, content.toString());

        // Clean up temporary files
        sourceFile.delete();
        destinationFile.delete();

        System.out.println("File Copy Test Passed");
    }
}

