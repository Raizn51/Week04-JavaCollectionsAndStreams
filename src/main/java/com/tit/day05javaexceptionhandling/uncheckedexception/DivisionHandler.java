package com.tit.day05javaexceptionhandling.uncheckedexception;

import java.util.*;

// Creating a class DivisionHandler to handle division operations
public class DivisionHandler
{
    // Method to perform division of two numbers with exception handling
    public void divideNumbers() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the numerator
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            // Prompt the user to enter the denominator
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e)
        {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");

        }
        catch (InputMismatchException e)
        {
            // Handle non-numeric input
            System.out.println("Error: Please enter numeric values only.");

        }
        finally
        {
            // Close the scanner
            scanner.close();
        }
    }
}
