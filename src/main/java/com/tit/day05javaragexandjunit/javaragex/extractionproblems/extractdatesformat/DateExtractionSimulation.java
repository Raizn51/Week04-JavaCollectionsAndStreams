package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractdatesformat;

import java.util.List;

/*
 * 6️⃣ Extract Dates in dd/mm/yyyy Format
 * 💡 Problem Statement:
 * Write a Java program to extract all dates in the format dd/mm/yyyy from a given text.
 *
 * 🔹 Example Text:
 * "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
 *
 * 🔹 Expected Output:
 * 12/05/2023, 15/08/2024, 29/02/2020
 */

// Creating a class DateExtractionSimulation to demonstrate date extraction
public class DateExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Extract dates from the text
        List<String> dates = DateExtractor.extractDates(text);

        // Print each extracted date
        for (String date : dates) {
            System.out.println(date);
        }
    }
}
