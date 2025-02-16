package com.tit.day05javaragexandjunit.javaragex.replaceandmodifystrings.replacemultiplespaceswithsinglespace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingSpaceReplacer to test space replacement operations
class TestingSpaceReplacer {

    // Test method for replacing multiple spaces
    @Test
    void testReplaceMultipleSpaces() {
        // Example input
        String input = "This  is  an   example   with    multiple spaces.";
        // Expected output
        String expectedOutput = "This is an example with multiple spaces.";
        // Asserting the replaced text
        assertEquals(expectedOutput, SpaceReplacer.replaceMultipleSpaces(input));
    }

    // Test method for text with no extra spaces
    @Test
    void testNoExtraSpaces() {
        // Example input
        String input = "This is a perfectly spaced sentence.";
        // Expected output
        String expectedOutput = "This is a perfectly spaced sentence.";
        // Asserting the replaced text
        assertEquals(expectedOutput, SpaceReplacer.replaceMultipleSpaces(input));
    }

    // Test method for text with leading and trailing spaces
    @Test
    void testLeadingAndTrailingSpaces() {
        // Example input
        String input = "   Leading and trailing spaces.    ";
        // Expected output
        String expectedOutput = " Leading and trailing spaces. ";
        // Asserting the replaced text
        assertEquals(expectedOutput, SpaceReplacer.replaceMultipleSpaces(input));
    }
}
