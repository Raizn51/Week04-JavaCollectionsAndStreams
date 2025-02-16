package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validateasocialsecuritynumber;

import java.util.regex.Pattern;

// Creating a class SSNValidator to handle SSN validation
public class SSNValidator {

    // Method to validate the SSN based on the given criteria
    public static boolean isValidSSN(String ssn) {
        // Regular expression for validating SSN
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        // Return whether the SSN matches the regular expression
        return Pattern.matches(regex, ssn);
    }
}
