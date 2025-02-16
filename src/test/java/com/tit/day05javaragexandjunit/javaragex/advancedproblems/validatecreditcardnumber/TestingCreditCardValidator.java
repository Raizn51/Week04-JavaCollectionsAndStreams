package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validatecreditcardnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingCreditCardValidator to test credit card number validation operations
class TestingCreditCardValidator {

    // Test method for valid Visa card numbers
    @Test
    void testValidVisaCardNumbers() {
        assertTrue(CreditCardValidator.isValidCreditCard("4111111111111111"));
        assertTrue(CreditCardValidator.isValidCreditCard("4012888888881881"));
    }

    // Test method for valid MasterCard card numbers
    @Test
    void testValidMasterCardNumbers() {
        assertTrue(CreditCardValidator.isValidCreditCard("5111111111111111"));
        assertTrue(CreditCardValidator.isValidCreditCard("5212345678901234"));
    }

    // Test method for invalid credit card numbers
    @Test
    void testInvalidCreditCardNumbers() {
        assertFalse(CreditCardValidator.isValidCreditCard("6111111111111111")); // starts with 6
        assertFalse(CreditCardValidator.isValidCreditCard("411111111111")); // too short
        assertFalse(CreditCardValidator.isValidCreditCard("51111111111111111")); // too long
    }
}
