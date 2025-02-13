package com.tit.day03javastreams.bufferedstreams;

import java.io.*;

// Creating a class FileHandler to handle file operations
public class FileHandler {
    
    // Method to copy file using buffered streams
    public long copyFileUsingBufferedStreams(String sourceFile, String destFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            long startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();

            return endTime - startTime;

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    // Method to copy file using unbuffered streams
    public long copyFileUsingUnbufferedStreams(String sourceFile, String destFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            long startTime = System.nanoTime();

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            return endTime - startTime;

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
