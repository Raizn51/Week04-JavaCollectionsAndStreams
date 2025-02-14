package com.tit.day05javaexceptionhandling.banktransactionsystemcheckedcustomexception;

// Creating a class BankAccount to handle bank account operations
public class BankAccount {

    private double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw amount from the balance
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
