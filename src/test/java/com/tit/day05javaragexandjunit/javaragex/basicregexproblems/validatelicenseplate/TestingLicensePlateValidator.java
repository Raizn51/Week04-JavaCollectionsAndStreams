package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatelicenseplate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingLicensePlateValidator to test license plate validation operations
class TestingLicensePlateValidator
{

    // Test method for valid license plates
    @Test
    void testValidLicensePlates()
    {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY6789"));
    }

    // Test method for invalid license plates
    @Test
    void testInvalidLicensePlates()
    {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345")); // starts with one letter
        assertFalse(LicensePlateValidator.isValidLicensePlate("1234AB")); // starts with digits
        assertFalse(LicensePlateValidator.isValidLicensePlate("ABED12")); // not four digits
    }
}
