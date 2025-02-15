package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatelicenseplate;

/*
 * 2️⃣ Validate a License Plate Number
 * 💡 Problem Statement:
 * License plate format: Starts with two uppercase letters, followed by four digits.
 * Example: "AB1234" is valid, but "A12345" is invalid.
 */

// Creating a class LicensePlateValidationSimulation to demonstrate license plate validation
public class LicensePlateValidationSimulation
{
    public static void main(String[] args)
    {
        // Example license plate numbers for testing
        String[] licensePlates = {"AB1234", "A12345", "XY6789", "ZZ0000"};

        // Validate each license plate number and print whether it is valid or invalid
        for (String licensePlate : licensePlates)
        {
            if (LicensePlateValidator.isValidLicensePlate(licensePlate))
            {
                System.out.println(licensePlate + " → Valid");
            } else {
                System.out.println(licensePlate + " → Invalid");
            }
        }
    }
}

