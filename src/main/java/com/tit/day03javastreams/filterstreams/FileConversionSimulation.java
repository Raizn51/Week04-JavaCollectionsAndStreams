package com.tit.day03javastreams.filterstreams;
/*
6. Filter Streams - Convert Uppercase to Lowercase
📌 Problem Statement:
Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.
*/

// Creating a class FileConversionSimulation to demonstrate file conversion operations
public class FileConversionSimulation {
    public static void main(String[] args) {
        // Creating an object of FileConverter
        FileConverter converter = new FileConverter();

        // Source and destination file paths
        String sourceFile = "src/main/resources/LargeTextFile.txt";
        String destFile = "src/main/resources/destination.txt";

        // Converting uppercase letters to lowercase in the file
        converter.convertUppercaseToLowercase(sourceFile, destFile);
    }
}
