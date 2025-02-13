package com.tit.day03javastreams.readalargefilelinebyline;

/*
9. Read a Large File Line by Line
📌 Problem Statement:
Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only lines containing the word "error".
Requirements:
Use BufferedReader for efficient reading.
Read line-by-line instead of loading the entire file.
Display only lines containing "error" (case insensitive).
*/

import java.io.*;

// Creating a class LargeFileReaderSimulation to demonstrate reading a large file
public class LargeFileReaderSimulation {
    public static void main(String[] args) {
        // Creating an object of LargeFileReader
        LargeFileReader fileReader = new LargeFileReader();

        // File path to read
        String filePath = "src/main/resources/500MBFile.txt";

        // Reading the file and printing lines containing "error"
        fileReader.readFileAndPrintErrorLines(filePath);
    }
}
