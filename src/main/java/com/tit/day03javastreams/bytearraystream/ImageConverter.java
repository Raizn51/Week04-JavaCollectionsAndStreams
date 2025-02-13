package com.tit.day03javastreams.bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

// Creating a class ImageConverter to handle image conversion operations
public class ImageConverter {
    // Method to convert an image file to a byte array
    public byte[] imageToByteArray(String imagePath) {
        try {
            return Files.readAllBytes(Paths.get(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to convert a byte array to an image file
    public void byteArrayToImage(byte[] byteArray, String outputPath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Image written to " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to verify if two files are identical
    public boolean areFilesIdentical(String filePath1, String filePath2) {
        try {
            byte[] file1 = Files.readAllBytes(Paths.get(filePath1));
            byte[] file2 = Files.readAllBytes(Paths.get(filePath2));
            return Arrays.equals(file1, file2);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
