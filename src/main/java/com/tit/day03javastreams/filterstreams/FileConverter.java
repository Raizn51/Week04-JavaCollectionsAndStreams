package com.tit.day03javastreams.filterstreams;

import java.io.*;

// Creating a class FileConverter to handle file conversion operations
public class FileConverter {
    // Method to convert uppercase letters to lowercase in a file
    public void convertUppercaseToLowercase(String sourceFile, String destFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(Character.toLowerCase(character));
            }
            System.out.println("File conversion completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
