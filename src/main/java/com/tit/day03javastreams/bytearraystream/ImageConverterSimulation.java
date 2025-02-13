package com.tit.day03javastreams.bytearraystream;

/*
5. ByteArray Stream - Convert Image to ByteArray
📌 Problem Statement:
Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.
*/

// Creating a class ImageConverterSimulation to demonstrate image conversion operations
public class ImageConverterSimulation {
    public static void main(String[] args) {
        // Creating an object of ImageConverter
        ImageConverter converter = new ImageConverter();

        // Image file paths
        String inputImagePath = "src/main/resources/Image.jpg";
        String outputImagePath = "src/main/resources/outputImage.jpg";

        // Convert image to byte array
        byte[] imageBytes = converter.imageToByteArray(inputImagePath);

        // Convert byte array back to image file
        if (imageBytes != null) {
            converter.byteArrayToImage(imageBytes, outputImagePath);

            // Verify if the new file is identical to the original image
            boolean areIdentical = converter.areFilesIdentical(inputImagePath, outputImagePath);
            System.out.println("Are the files identical? " + areIdentical);
        }
    }
}

