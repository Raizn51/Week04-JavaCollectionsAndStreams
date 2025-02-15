package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validateusername;

import java.util.regex.Pattern;

// Creating a class UsernameValidator to handle username validation
public class UsernameValidator {

    // Method to validate the username based on the given criteria
    public static boolean isValidUsername(String username)
    {
        // Regular expression for validating the username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        // Return whether the username matches the regular expression
        return Pattern.matches(regex, username);
    }
}
