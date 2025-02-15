package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatehexcolorcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingHexColorValidator to test hex color code validation operations
class TestingHexColorValidator
{

    // Test method for valid hex color codes
    @Test
    void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#ABCDEF"));
    }

    // Test method for invalid hex color codes
    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123")); // too short
        assertFalse(HexColorValidator.isValidHexColor("FFA500")); // missing #
        assertFalse(HexColorValidator.isValidHexColor("#GGGGGG")); // invalid characters
    }
}
