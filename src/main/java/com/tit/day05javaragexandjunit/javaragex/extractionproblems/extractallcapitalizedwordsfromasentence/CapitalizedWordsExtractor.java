package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallcapitalizedwordsfromasentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating a class CapitalizedWordsExtractor to handle capitalized words extraction
public class CapitalizedWordsExtractor {

    // Method to extract all capitalized words from the given sentence
    public static List<String> extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();
        // Regular expression for matching capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching capitalized words to the list
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }
}
