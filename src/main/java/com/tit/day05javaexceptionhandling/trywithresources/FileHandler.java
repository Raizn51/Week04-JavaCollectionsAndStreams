package com.tit.day05javaexceptionhandling.trywithresources;

import java.io.*;

// Creating a class FileHandler to handle file operations
public class FileHandler {

    // Method to read the first line from a file using BufferedReader and try-with-resources
    public void readFirstLine(String fileName) {
        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Read and print the first line of the file
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            // Handle IOException and print an error message
            System.out.println("Error reading file");
        }
    }
}
