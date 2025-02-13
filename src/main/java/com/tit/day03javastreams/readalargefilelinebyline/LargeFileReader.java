package com.tit.day03javastreams.readalargefilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Creating a class LargeFileReader to handle file reading operations
public class LargeFileReader {

    // Method to read a file line by line and print lines containing the word "error"
    public void readFileAndPrintErrorLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
