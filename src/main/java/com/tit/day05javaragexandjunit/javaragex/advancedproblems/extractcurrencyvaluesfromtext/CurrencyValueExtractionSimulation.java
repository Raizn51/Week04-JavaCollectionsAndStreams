package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractcurrencyvaluesfromtext;

import java.util.List;

/*
 * 1️⃣3️⃣ Extract Currency Values from a Text
 * 💡 Problem Statement:
 * Write a Java program to extract currency values from a given text.
 *
 * 🔹 Example Text:
 * "The price is $45.99, and the discount is 10.50."
 *
 * 🔹 Expected Output:
 * $45.99, 10.50
 */

// Creating a class CurrencyValueExtractionSimulation to demonstrate currency value extraction
public class CurrencyValueExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The price is $45.99, and the discount is 10.50.";

        // Extract currency values from the text
        List<String> values = CurrencyValueExtractor.extractCurrencyValues(text);

        // Print each extracted currency value
        for (String value : values) {
            System.out.println(value);
        }
    }
}
