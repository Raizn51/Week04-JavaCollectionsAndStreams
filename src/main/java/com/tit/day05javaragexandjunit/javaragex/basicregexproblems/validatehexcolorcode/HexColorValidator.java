package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatehexcolorcode;

import java.util.regex.Pattern;

// Creating a class HexColorValidator to handle hex color code validation
public class HexColorValidator {

    // Method to validate the hex color code based on the given criteria
    public static boolean isValidHexColor(String hexColor) {
        // Regular expression for validating the hex color code
        String regex = "^#[0-9A-Fa-f]{6}$";
        // Return whether the hex color code matches the regular expression
        return Pattern.matches(regex, hexColor);
    }
}
