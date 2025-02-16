package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractprogramminglanguagenames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

/**
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

// Creating a class ProgrammingLanguageExtractor to handle programming language extraction
public class ProgrammingLanguageExtractor {

    // Method to extract programming language names from the given text
    public static List<String> extractProgrammingLanguages(String text) {
        List<String> languages = new ArrayList<>();
        // Regular expression for matching programming language names (case-insensitive)
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching programming language names to the list
        while (matcher.find()) {
            // Capitalize the matched group and add it to the list
            String language = capitalize(matcher.group());
            languages.add(language);
        }
        return languages;
    }

    // Method to capitalize the first letter of a word
    private static String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}


