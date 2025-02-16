package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallcapitalizedwordsfromasentence;

import java.util.*;

/*
 * 5️⃣ Extract All Capitalized Words from a Sentence
 * 💡 Problem Statement:
 * Write a Java program to extract all capitalized words from a given sentence.
 *
 * 🔹 Example Text:
 * "The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
 *
 * 🔹 Expected Output:
 * Eiffel, Tower, Paris, Statue, Liberty, New, York
 */

// Creating a class CapitalizedWordsExtractionSimulation to demonstrate capitalized words extraction
public class CapitalizedWordsExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Extract capitalized words from the text
        List<String> capitalizedWords = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        // Print each extracted capitalized word
        for (String word : capitalizedWords) {
            System.out.println(word);
        }
    }
}
