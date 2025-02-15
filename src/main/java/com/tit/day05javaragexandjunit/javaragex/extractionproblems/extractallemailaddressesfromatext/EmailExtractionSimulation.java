package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallemailaddressesfromatext;

import java.util.List;

/*
 * 4️⃣ Extract All Email Addresses from a Text
 * 💡 Problem Statement:
 * Write a Java program to extract all email addresses from a given text.
 *
 * 🔹 Example Text:
 * "Contact us at support@example.com and info@company.org"
 *
 * 🔹 Expected Output:
 * support@example.com
 * info@company.org
 */

// Creating a class EmailExtractionSimulation to demonstrate email extraction
public class EmailExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "Contact us at support@example.com and info@company.org";

        // Extract email addresses from the text
        List<String> emails = EmailExtractor.extractEmails(text);

        // Print each extracted email address
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
