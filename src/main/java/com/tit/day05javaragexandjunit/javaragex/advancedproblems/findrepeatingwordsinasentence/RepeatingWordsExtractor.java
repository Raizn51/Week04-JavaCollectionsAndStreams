package com.tit.day05javaragexandjunit.javaragex.advancedproblems.findrepeatingwordsinasentence;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating a class RepeatingWordsExtractor to handle repeating words extraction
public class RepeatingWordsExtractor {

    // Method to find repeating words in the given text
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        // Regular expression for finding repeating words
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Find and add repeating words to the set
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1).toLowerCase());
        }
        return repeatingWords;
    }
}
