package com.tit.day03javastreams.bufferedstreams;
/*
2. Buffered Streams - Efficient File Copy
📌 Problem Statement:
Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.
*/

// Creating a class FileCopySimulation to demonstrate file copy operations
public class FileCopySimulation
{
    public static void main(String[] args) {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Source and destination file paths
        String sourceFile = "src/main/java/com/tit/day03javastreams/bufferedstreams/100MBFile.txt";
        String destinyFileBuffered = "src/main/resources/copiedBuffered.txt";
        String destinyFileUnbuffered = "src/main/resources/copiedUnbuffered.txt";

        // Copy file using buffered streams and measure time
        long bufferedTime = fileHandler.copyFileUsingBufferedStreams(sourceFile, destinyFileBuffered);

        // Copy file using unbuffered streams and measure time
        long unbufferedTime = fileHandler.copyFileUsingUnbufferedStreams(sourceFile, destinyFileUnbuffered);

        // Print execution times
        System.out.println("Buffered Streams Time: " + bufferedTime + " ns");
        System.out.println("Unbuffered Streams Time: " + unbufferedTime + " ns");
    }
}
/*
* 3. Read User Input from Console
📌 Problem Statement:
Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.
Requirements:
Use BufferedReader for console input.
Use FileWriter to write the data into a file.
Handle exceptions properly.

* */