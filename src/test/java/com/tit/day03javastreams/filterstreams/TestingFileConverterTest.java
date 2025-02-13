package com.tit.day03javastreams.filterstreams;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFileConverter to test file conversion operations
class TestingFileConverter {

    // Test method for converting uppercase to lowercase in a file
    @Test
    void testConvertUppercaseToLowercase() throws IOException {
        // Creating an object of FileConverter
        FileConverter converter = new FileConverter();

        // Create temporary source and destination files
        File sourceFile = new File("test_source.txt");
        File destFile = new File("test_destination.txt");

        // Write some content to the source file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile))) {
            writer.write("HELLO WORLD!\nThis is a Test.");
        }

        // Convert uppercase to lowercase in the file
        converter.convertUppercaseToLowercase(sourceFile.getPath(), destFile.getPath());

        // Read the contents of the destination file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(destFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        // Expected content
        String expectedContent = "hello world!\nthis is a test.\n";

        // Asserting the file content
        assertEquals(expectedContent, content.toString());

        // Clean up temporary files
        sourceFile.delete();
        destFile.delete();

        System.out.println("File Conversion Test Passed");
    }
}
