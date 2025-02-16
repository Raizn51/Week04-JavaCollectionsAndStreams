package com.tit.day05javaragexandjunit.javaragex.replaceandmodifystrings.censorbadwordsinsentence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingBadWordCensor to test bad word censorship operations
class TestingBadWordCensor {

    // Test method for censoring bad words
    @Test
    void testCensorBadWords() {
        // Example input
        String input = "This is a damn bad example with some stupid words.";
        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");
        // Expected output
        String expectedOutput = "This is a **** bad example with some **** words.";
        // Asserting the censored text
        assertEquals(expectedOutput, BadWordCensor.censorBadWords(input, badWords));
    }

    // Test method for text without bad words
    @Test
    void testNoBadWords() {
        // Example input
        String input = "This is a perfectly fine sentence.";
        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");
        // Expected output (unchanged text)
        String expectedOutput = "This is a perfectly fine sentence.";
        // Asserting the censored text
        assertEquals(expectedOutput, BadWordCensor.censorBadWords(input, badWords));
    }

    // Test method for text with mixed case bad words
    @Test
    void testMixedCaseBadWords() {
        // Example input with mixed case bad words
        String input = "This is a Damn bad example with some Stupid words.";
        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");
        // Expected output
        String expectedOutput = "This is a **** bad example with some **** words.";
        // Asserting the censored text
        assertEquals(expectedOutput, BadWordCensor.censorBadWords(input, badWords));
    }
}
