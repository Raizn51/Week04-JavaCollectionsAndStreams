package com.tit.day05javaexceptionhandling.trywithresources;

/*
 * 5. try-with-resources (Auto-closing Resources)
 * 💡 Problem Statement:
 * Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
 * Use try-with-resources to ensure the file is automatically closed after reading.
 * Handle any IOException that may occur.
 *
 * Expected Behavior:
 * If the file exists, print its first line.
 * If the file does not exist, catch IOException and print "Error reading file".
 */

// Creating a class FileReadSimulation to demonstrate file reading operation
public class FileReadSimulation {
    public static void main(String[] args) {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();
        // File name
        String fileName = "src/main/resources/data.txt";
        // Reading the first line of the file
        fileHandler.readFirstLine(fileName);
    }
}
