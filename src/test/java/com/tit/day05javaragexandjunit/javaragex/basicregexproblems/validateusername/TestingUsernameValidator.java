package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validateusername;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingUsernameValidator to test username validation operations
class TestingUsernameValidator
{

    // Test method for valid usernames
    @Test
    void testValidUsernames()
    {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("Valid_User123"));
    }

    // Test method for invalid usernames
    @Test
    void testInvalidUsernames()
    {
        assertFalse(UsernameValidator.isValidUsername("123user")); // starts with a number
        assertFalse(UsernameValidator.isValidUsername("us")); // too short
        assertFalse(UsernameValidator.isValidUsername("user1234567890123")); // too long
        assertFalse(UsernameValidator.isValidUsername("user@123")); // contains invalid character
    }
}
