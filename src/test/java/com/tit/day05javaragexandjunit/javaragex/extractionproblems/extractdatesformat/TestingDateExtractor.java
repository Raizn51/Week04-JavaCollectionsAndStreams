package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractdatesformat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingDateExtractor to test date extraction operations
class TestingDateExtractor {

    // Test method for extracting dates
    @Test
    void testExtractDates() {
        // Example text
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        // Expected output
        List<String> expectedDates = Arrays.asList("12/05/2023", "15/08/2024", "29/02/2020");
        // Asserting the extracted dates
        assertEquals(expectedDates, DateExtractor.extractDates(text));
    }

    // Test method for text without dates
    @Test
    void testNoDates() {
        // Example text without dates
        String text = "No dates here!";
        // Expected output
        List<String> expectedDates = Arrays.asList();
        // Asserting the extracted dates
        assertEquals(expectedDates, DateExtractor.extractDates(text));
    }

    // Test method for text with multiple date formats
    @Test
    void testVariousDateFormats() {
        // Example text with various formats of dates
        String text = "Dates: 01/01/2021, 15/03/2022, and 20/12/2023.";
        // Expected output
        List<String> expectedDates = Arrays.asList("01/01/2021", "15/03/2022", "20/12/2023");
        // Asserting the extracted dates
        assertEquals(expectedDates, DateExtractor.extractDates(text));
    }
}
