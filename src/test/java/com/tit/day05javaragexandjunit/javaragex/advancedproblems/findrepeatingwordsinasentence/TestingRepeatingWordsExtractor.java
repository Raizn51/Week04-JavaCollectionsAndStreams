package com.tit.day05javaragexandjunit.javaragex.advancedproblems.findrepeatingwordsinasentence;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingRepeatingWordsExtractor to test repeating words extraction operations
class TestingRepeatingWordsExtractor {

    // Test method for finding repeating words
    @Test
    void testFindRepeatingWords() {
        // Example input
        String input = "This is is a repeated repeated word test.";
        // Expected output
        Set<String> expectedWords = new HashSet<>(Set.of("is", "repeated"));
        // Asserting the repeating words
        assertEquals(expectedWords, RepeatingWordsExtractor.findRepeatingWords(input));
    }

    // Test method for text without repeating words
    @Test
    void testNoRepeatingWords() {
        // Example input without repeating words
        String input = "This sentence has no repeating words.";
        // Expected output
        Set<String> expectedWords = new HashSet<>();
        // Asserting the repeating words
        assertEquals(expectedWords, RepeatingWordsExtractor.findRepeatingWords(input));
    }

    // Test method for text with mixed case repeating words
    @Test
    void testMixedCaseRepeatingWords() {
        // Example input with mixed case repeating words
        String input = "The repeated word test is is Repeated repeated.";
        // Expected output
        Set<String> expectedWords = new HashSet<>(Set.of("repeated", "is"));
        // Asserting the repeating words
        assertEquals(expectedWords, RepeatingWordsExtractor.findRepeatingWords(input));
    }
}
