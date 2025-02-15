package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatelicenseplate;

import java.util.regex.Pattern;

// Creating a class LicensePlateValidator to handle license plate validation
public class LicensePlateValidator
{
    // Method to validate the license plate number based on the given criteria
    public static boolean isValidLicensePlate(String licensePlate)
    {
        // Regular expression for validating the license plate number
        String regex = "^[A-Z]{2}\\d{4}$";
        // Return whether the license plate matches the regular expression
        return Pattern.matches(regex, licensePlate);
    }
}
