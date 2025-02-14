package com.tit.day05javaexceptionhandling.banktransactionsystemcheckedcustomexception;

import java.util.Scanner;

/*
 * 10. Bank Transaction System (Checked + Custom Exception)
 * 💡 Problem Statement:
 * Develop a Bank Account System where:
 * withdraw(double amount) method:
 * - Throws InsufficientBalanceException if withdrawal amount exceeds balance.
 * - Throws IllegalArgumentException if the amount is negative.
 * Handle exceptions in main().
 *
 * Expected Behavior:
 * If valid, print "Withdrawal successful, new balance: X".
 * If balance is insufficient, throw and handle "Insufficient balance!".
 * If the amount is negative, throw and handle "Invalid amount!".
 */

// Creating a class BankTransactionSimulation to demonstrate bank transactions
public class BankTransactionSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of BankAccount with initial balance
        BankAccount account = new BankAccount(1000);

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        double amount = scanner.nextDouble();

        try {
            // Attempt to withdraw the amount
            account.withdraw(amount);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            // Handle exceptions and print the message
            System.out.println(e.getMessage());
        } finally {
            // Closing the scanner object
            scanner.close();
        }
    }
}
