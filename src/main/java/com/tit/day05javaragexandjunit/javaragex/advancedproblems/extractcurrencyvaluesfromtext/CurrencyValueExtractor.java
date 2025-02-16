package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractcurrencyvaluesfromtext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating a class CurrencyValueExtractor to handle currency value extraction
public class CurrencyValueExtractor {

    // Method to extract currency values from the given text
    public static List<String> extractCurrencyValues(String text) {
        List<String> values = new ArrayList<>();
        // Regular expression for matching currency values
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching currency values to the list
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }
}
