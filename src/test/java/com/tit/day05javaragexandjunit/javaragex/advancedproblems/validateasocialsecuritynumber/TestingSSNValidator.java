package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validateasocialsecuritynumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingSSNValidator to test SSN validation operations
class TestingSSNValidator {

    // Test method for valid SSNs
    @Test
    void testValidSSNs() {
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
        assertTrue(SSNValidator.isValidSSN("987-65-4321"));
    }

    // Test method for invalid SSNs
    @Test
    void testInvalidSSNs() {
        assertFalse(SSNValidator.isValidSSN("123456789")); // missing dashes
        assertFalse(SSNValidator.isValidSSN("123-456-789")); // incorrect format
        assertFalse(SSNValidator.isValidSSN("123-45-678")); // too short
    }
}
