package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractlinksfromawebpage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating a class LinkExtractor to handle link extraction
public class LinkExtractor {

    // Method to extract all links from the given text
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        // Regular expression for matching links
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching links to the list
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}
