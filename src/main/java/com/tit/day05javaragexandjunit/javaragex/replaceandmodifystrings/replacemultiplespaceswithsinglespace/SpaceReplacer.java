package com.tit.day05javaragexandjunit.javaragex.replaceandmodifystrings.replacemultiplespaceswithsinglespace;

// Creating a class SpaceReplacer to handle space replacement
public class SpaceReplacer {

    // Method to replace multiple spaces with a single space in the given text
    public static String replaceMultipleSpaces(String text) {
        // Replace multiple spaces with a single space using regex
        return text.replaceAll("\\s+", " ");
    }
}
