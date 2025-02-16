package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validateasocialsecuritynumber;

import java.util.regex.Pattern;

/*
 * 1️⃣5️⃣ Validate a Social Security Number (SSN)
 * 💡 Problem Statement:
 * A valid SSN has the format "XXX-XX-XXXX".
 *
 * 🔹 Example Input:
 * "My SSN is 123-45-6789."
 *
 * 🔹 Expected Output:
 * ✅ "123-45-6789" is valid
 * ❌ "123456789" is invalid
 */

// Creating a class SSNValidationSimulation to demonstrate SSN validation
public class SSNValidationSimulation {
    public static void main(String[] args) {
        // Example SSNs for testing
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321"};

        // Validate each SSN and print whether it is valid or invalid
        for (String ssn : ssns) {
            if (SSNValidator.isValidSSN(ssn)) {
                System.out.println(ssn + " → Valid");
            } else {
                System.out.println(ssn + " → Invalid");
            }
        }
    }
}
