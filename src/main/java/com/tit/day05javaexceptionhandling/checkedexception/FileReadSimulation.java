package com.tit.day05javaexceptionhandling.checkedexception;

/*
1. Checked Exception (Compile-time Exception)
💡 Problem Statement:
Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
Expected Behavior:
If the file exists, print its contents.
If the file does not exist, catch the IOException and print "File not found".
 */

// Creating a class FileReadSimulation to demonstrate file reading operation
public class FileReadSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();
        // File name
        String fileName = "src/main/resources/data.txt";
        // Reading the file
        fileHandler.readFile(fileName);
    }
}
