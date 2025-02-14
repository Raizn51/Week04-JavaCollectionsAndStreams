package com.tit.day05javaexceptionhandling.customexception;

// Creating a class AgeValidator to handle age validation
public class AgeValidator
{

    // Method to validate age and throw InvalidAgeException if age < 18
    public static void validateAge(int age) throws InvalidAgeException
    {
        if (age < 18)
        {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else
        {
            System.out.println("Access granted!");
        }
    }
}


