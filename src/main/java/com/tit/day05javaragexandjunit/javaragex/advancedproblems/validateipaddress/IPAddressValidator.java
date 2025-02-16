package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validateipaddress;

import java.util.regex.Pattern;

// Creating a class IPAddressValidator to handle IP address validation
public class IPAddressValidator {

    // Method to validate the IP address based on the given criteria
    public static boolean isValidIPAddress(String ipAddress) {
        // Regular expression for validating IPv4 addresses
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        // Return whether the IP address matches the regular expression
        return Pattern.matches(regex, ipAddress);
    }
}
