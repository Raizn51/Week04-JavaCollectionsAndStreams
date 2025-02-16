package com.tit.day05javaragexandjunit.javaragex.replaceandmodifystrings.replacemultiplespaceswithsinglespace;

/*
 * 8️⃣ Replace Multiple Spaces with a Single Space
 * 💡 Problem Statement:
 * Write a Java program to replace multiple spaces with a single space in a given text.
 *
 * 🔹 Example Input:
 * "This is an example with multiple spaces."
 *
 * 🔹 Expected Output:
 * "This is an example with multiple spaces."
 */

// Creating a class SpaceReplacementSimulation to demonstrate space replacement
public class SpaceReplacementSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "This  is  an   example   with    multiple spaces.";

        // Replace multiple spaces in the text
        String result = SpaceReplacer.replaceMultipleSpaces(text);

        // Print the result
        System.out.println(result);
    }
}
