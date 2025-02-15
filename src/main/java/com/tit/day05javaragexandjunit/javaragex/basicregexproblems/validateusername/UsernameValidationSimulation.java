package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validateusername;

/*
 * 1️⃣ Validate a Username
 * 💡 Problem Statement:
 * A valid username:
 * - Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
 * - Must start with a letter
 * - Must be between 5 to 15 characters long
 *
 * 🔹 Example Inputs & Outputs
 * ✅ "user_123" → Valid
 * ❌ "123user" → Invalid (starts with a number)
 * ❌ "us" → Invalid (too short)
 */

// Creating a class UsernameValidationSimulation to demonstrate username validation
public class UsernameValidationSimulation
{
    public static void main(String[] args)
    {
        // Example usernames for testing
        String[] usernames = {"user_123", "123user", "use", "Valid_User123"};

        // Validate each username and print whether it is valid or invalid
        for (String username : usernames)
        {
            if (UsernameValidator.isValidUsername(username))
            {
                System.out.println(username + " → Valid");
            }
            else
            {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
