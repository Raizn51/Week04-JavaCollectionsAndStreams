package com.tit.day05javaexceptionhandling.uncheckedexception;

/*
 * 2. Unchecked Exception (Runtime Exception)
 * 💡 Problem Statement:
 * Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
 * - ArithmeticException if division by zero occurs.
 * - InputMismatchException if the user enters a non-numeric value.
 *
 * Expected Behavior:
 * - If the user enters valid numbers, print the result of the division.
 * - If the user enters 0 as the denominator, catch and handle ArithmeticException.
 * - If the user enters a non-numeric value, catch and handle InputMismatchException.
 */


// Creating a class DivisionSimulation to demonstrate division operation
public class DivisionSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of DivisionHandler
        DivisionHandler divisionHandler = new DivisionHandler();
        // Performing the division
        divisionHandler.divideNumbers();
    }
}

