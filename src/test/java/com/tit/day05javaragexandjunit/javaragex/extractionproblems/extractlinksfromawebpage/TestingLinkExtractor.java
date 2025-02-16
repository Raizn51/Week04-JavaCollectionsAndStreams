package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractlinksfromawebpage;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingLinkExtractor to test link extraction operations
class TestingLinkExtractor {

    // Test method for extracting links
    @Test
    void testExtractLinks() {
        // Example text
        String text = "Visit https://www.google.com and http://example.org for more info.";
        // Expected output
        List<String> expectedLinks = Arrays.asList("https://www.google.com", "http://example.org");
        // Asserting the extracted links
        assertEquals(expectedLinks, LinkExtractor.extractLinks(text));
    }

    // Test method for text without links
    @Test
    void testNoLinks() {
        // Example text without links
        String text = "No links here!";
        // Expected output
        List<String> expectedLinks = Arrays.asList();
        // Asserting the extracted links
        assertEquals(expectedLinks, LinkExtractor.extractLinks(text));
    }

    // Test method for text with multiple link formats
    @Test
    void testVariousLinkFormats() {
        // Example text with various formats of links
        String text = "Check out https://www.example.com, http://test.org, and https://sub.domain.co.uk.";
        // Expected output
        List<String> expectedLinks = Arrays.asList("https://www.example.com", "http://test.org", "https://sub.domain.co.uk");
        // Asserting the extracted links
        assertEquals(expectedLinks, LinkExtractor.extractLinks(text));
    }
}
