package com.tit.day05javaexceptionhandling.throwvsthrows;

// Creating a class InterestCalculator to handle interest calculations
public class InterestCalculator {

    // Method to calculate interest and propagate IllegalArgumentException if input is invalid
    public double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException
    {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        // Calculate interest
        double interest = amount * rate * years / 100;
        return interest;
    }
}
