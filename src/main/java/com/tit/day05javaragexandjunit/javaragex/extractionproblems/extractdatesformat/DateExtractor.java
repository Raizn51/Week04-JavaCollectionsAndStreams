package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractdatesformat;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating a class DateExtractor to handle date extraction
public class DateExtractor {

    // Method to extract all dates in the format dd/mm/yyyy from the given text
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        // Regular expression for matching dates in dd/mm/yyyy format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching dates to the list
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}
