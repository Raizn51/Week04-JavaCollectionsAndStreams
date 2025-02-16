package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validatecreditcardnumber;

import java.util.regex.Pattern;

/*
 * 1️⃣1️⃣ Validate a Credit Card Number (Visa, MasterCard, etc.)
 * 💡 Problem Statement:
 * A Visa card number starts with 4 and has 16 digits.
 * A MasterCard starts with 5 and has 16 digits.
 */

// Creating a class CreditCardValidationSimulation to demonstrate credit card number validation
public class CreditCardValidationSimulation {
    public static void main(String[] args) {
        // Example credit card numbers for testing
        String[] cardNumbers = {"4111111111111111", "5111111111111111", "6111111111111111", "411111111111"};

        // Validate each credit card number and print whether it is valid or invalid
        for (String cardNumber : cardNumbers) {
            if (CreditCardValidator.isValidCreditCard(cardNumber)) {
                System.out.println(cardNumber + " → Valid");
            } else {
                System.out.println(cardNumber + " → Invalid");
            }
        }
    }
}
