package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractprogramminglanguagenames;

import java.util.List;

/*
 * 1️⃣2️⃣ Extract Programming Language Names from a Text
 * 💡 Problem Statement:
 * Write a Java program to extract programming language names from a given text.
 *
 * 🔹 Example Text:
 * "I love Java, Python, and JavaScript, but I haven't tried Go yet."
 *
 * 🔹 Expected Output:
 * Java, Python, JavaScript, Go
 */

// Creating a class ProgrammingLanguageExtractionSimulation to demonstrate programming language extraction
public class ProgrammingLanguageExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Extract programming languages from the text
        List<String> languages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);

        // Print each extracted programming language name
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
