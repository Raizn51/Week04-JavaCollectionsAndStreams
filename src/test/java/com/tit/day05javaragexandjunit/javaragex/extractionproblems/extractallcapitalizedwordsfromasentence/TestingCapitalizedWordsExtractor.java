package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallcapitalizedwordsfromasentence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingCapitalizedWordsExtractor to test capitalized words extraction operations
class TestingCapitalizedWordsExtractor {

    // Test method for extracting capitalized words
    @Test
    void testExtractCapitalizedWords() {
        // Example text
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        // Expected output
        List<String> expectedWords = Arrays.asList("The","Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York");
        // Asserting the extracted capitalized words
        assertEquals(expectedWords, CapitalizedWordsExtractor.extractCapitalizedWords(text));
    }

    // Test method for text without capitalized words
    @Test
    void testNoCapitalizedWords() {
        // Example text without capitalized words
        String text = "this is a sentence without capitalized words.";
        // Expected output
        List<String> expectedWords = Arrays.asList();
        // Asserting the extracted capitalized words
        assertEquals(expectedWords, CapitalizedWordsExtractor.extractCapitalizedWords(text));
    }

    // Test method for text with multiple capitalized words formats
    @Test
    void testVariousCapitalizedWordsFormats() {
        // Example text with various formats of capitalized words
        String text = "Albert Einstein and Isaac Newton are renowned scientists.";
        // Expected output
        List<String> expectedWords = Arrays.asList("Albert", "Einstein", "Isaac", "Newton");
        // Asserting the extracted capitalized words
        assertEquals(expectedWords, CapitalizedWordsExtractor.extractCapitalizedWords(text));
    }
}

