package com.tit.day05javaexceptionhandling.customexception;

/*
 * 3. Custom Exception (User-defined Exception)
 * 💡 Problem Statement:
 * Create a custom exception called InvalidAgeException.
 * Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
 * In main(), take user input and call validateAge().
 * If an exception occurs, display "Age must be 18 or above".
 *
 * Expected Behavior:
 * If the age is >=18, print "Access granted!".
 * If age <18, throw InvalidAgeException and display the message.
 */

import java.util.Scanner;

// Creating a class AgeValidationSimulation to demonstrate age validation
public class AgeValidationSimulation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        // Read the user's age
        int age = scanner.nextInt();

        try {
            // Validate the age
            AgeValidator.validateAge(age);
        } catch (InvalidAgeException e) {
            // Print the exception message if an exception occurs
            System.out.println(e.getMessage());
        } finally {
            // Close the Scanner object
            scanner.close();
        }
    }
}