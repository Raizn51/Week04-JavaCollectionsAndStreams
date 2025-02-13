package com.tit.day03javastreams.filehandling;
/*
1. File Handling - Read and Write a Text File
📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/

// Creating a class FileCopySimulation to demonstrate file copy operation
public class FileCopySimulation
{
    public static void main(String[] args)
    {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Source and destination file paths
        String sourceFile = "src/main/java/com/tit/day03javastreams/filehandling/LargeTextFile.txt";
        String destinationFile = "src/main/java/com/tit/day03javastreams/filehandling/CopyLargeTextFile.txt";

        // Copying the file
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}
