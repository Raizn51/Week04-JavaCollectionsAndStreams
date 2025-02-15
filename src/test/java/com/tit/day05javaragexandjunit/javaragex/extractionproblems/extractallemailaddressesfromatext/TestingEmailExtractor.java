package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallemailaddressesfromatext;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingEmailExtractor to test email extraction operations
class TestingEmailExtractor {

    // Test method for extracting email addresses
    @Test
    void testExtractEmails() {
        // Example text
        String text = "Contact us at support@example.com and info@company.org";
        // Expected output
        List<String> expectedEmails = Arrays.asList("support@example.com", "info@company.org");
        // Asserting the extracted emails
        assertEquals(expectedEmails, EmailExtractor.extractEmails(text));
    }

    // Test method for text without email addresses
    @Test
    void testNoEmails() {
        // Example text without email addresses
        String text = "No email addresses here!";
        // Expected output
        List<String> expectedEmails = Arrays.asList();
        // Asserting the extracted emails
        assertEquals(expectedEmails, EmailExtractor.extractEmails(text));
    }

    // Test method for text with multiple formats of email addresses
    @Test
    void testVariousEmailFormats() {
        // Example text with various formats of email addresses
        String text = "Emails: john.doe@example.com, jane-doe@company.co.uk, contact@domain.info";
        // Expected output
        List<String> expectedEmails = Arrays.asList("john.doe@example.com", "jane-doe@company.co.uk", "contact@domain.info");
        // Asserting the extracted emails
        assertEquals(expectedEmails, EmailExtractor.extractEmails(text));
    }
}
