package com.tit.day03javastreams.bytearraystream;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingImageConverter to test image conversion operations
class TestingImageConverter {

    // Test method for image conversion and verification
    @Test
    void testImageConversion() {
        // Creating an object of ImageConverter
        ImageConverter converter = new ImageConverter();

        // Image file paths
        String inputImagePath = "src/main/resources/Image.jpg";
        String outputImagePath = "src/main/resources/test_outputImage.jpg";

        // Convert image to byte array
        byte[] imageBytes = converter.imageToByteArray(inputImagePath);

        // Convert byte array back to image file
        if (imageBytes != null) {
            converter.byteArrayToImage(imageBytes, outputImagePath);

            // Verify if the new file is identical to the original image
            boolean areIdentical = converter.areFilesIdentical(inputImagePath, outputImagePath);

            // Asserting the files are identical
            assertTrue(areIdentical);

            // Clean up temporary file
            new File(outputImagePath).delete();

            System.out.println("Image Conversion Test Passed");
        }
    }
}

