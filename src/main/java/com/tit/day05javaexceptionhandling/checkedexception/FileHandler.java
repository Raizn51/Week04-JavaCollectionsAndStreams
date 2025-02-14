package com.tit.day05javaexceptionhandling.checkedexception;

import java.io.*;

// Creating a class FileHandler to handle file operations
public class FileHandler
{

    // Method to read contents from the file
    public void readFile(String fileName)
    {
        BufferedReader reader = null;

        try {
            // Check if file exists
            File file = new File(fileName);
            if (!file.exists())
            {
                throw new IOException("File not found");
            }

            // Create BufferedReader
            reader = new BufferedReader(new FileReader(file));
            String line;
            // Read and print each line of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // Close resources
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
