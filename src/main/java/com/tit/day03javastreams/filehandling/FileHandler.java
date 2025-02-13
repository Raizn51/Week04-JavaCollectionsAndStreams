package com.tit.day03javastreams.filehandling;

import java.io.*;

// Creating a class FileHandler to handle file operations
public class FileHandler
{
    // Method to copy contents from source file to destination file
    public void copyFile(String sourceFile, String destinationFile)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Check if source file exists
            File source = new File(sourceFile);
            if (!source.exists())
            {
                System.out.println("Source file does not exist.");
                return;
            }

            // Create FileInputStream and FileOutputStream
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            // Read and write byte by byte
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // Close resources
            try {
                if (fis != null)
                {
                    fis.close();
                }
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
