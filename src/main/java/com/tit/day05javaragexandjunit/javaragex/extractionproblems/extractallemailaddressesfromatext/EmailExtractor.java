package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallemailaddressesfromatext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating a class EmailExtractor to handle email extraction
public class EmailExtractor {

    // Method to extract all email addresses from the given text
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        // Regular expression for matching email addresses
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching email addresses to the list
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}
