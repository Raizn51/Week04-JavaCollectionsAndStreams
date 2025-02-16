package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validateipaddress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingIPAddressValidator to test IP address validation operations
class TestingIPAddressValidator
{

    // Test method for valid IP addresses
    @Test
    void testValidIPAddresses() {
        assertTrue(IPAddressValidator.isValidIPAddress("192.168.0.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPAddressValidator.isValidIPAddress("0.0.0.0"));
    }

    // Test method for invalid IP addresses
    @Test
    void testInvalidIPAddresses() {
        assertFalse(IPAddressValidator.isValidIPAddress("256.256.256.256")); // out of range
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.0")); // missing one group
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.0.999")); // out of range
    }
}
