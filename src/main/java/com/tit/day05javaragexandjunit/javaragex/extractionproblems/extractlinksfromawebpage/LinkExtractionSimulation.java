package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractlinksfromawebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

/*
 * 7️⃣ Extract Links from a Web Page
 * 💡 Problem Statement:
 * Write a Java program to extract all links from a given text.
 *
 * 🔹 Example Text:
 * "Visit https://www.google.com and http://example.org for more info."
 *
 * 🔹 Expected Output:
 * https://www.google.com, http://example.org
 */

// Creating a class LinkExtractionSimulation to demonstrate link extraction
public class LinkExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Extract links from the text
        List<String> links = LinkExtractor.extractLinks(text);

        // Print each extracted link
        for (String link : links) {
            System.out.println(link);
        }
    }
}
