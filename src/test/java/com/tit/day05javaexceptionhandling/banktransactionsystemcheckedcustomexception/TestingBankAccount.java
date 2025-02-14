package com.tit.day05javaexceptionhandling.banktransactionsystemcheckedcustomexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingBankAccount to test bank account operations
class TestingBankAccount {

    // Test method for valid withdrawal
    @Test
    void testValidWithdrawal() throws InsufficientBalanceException {
        // Creating an object of BankAccount with initial balance
        BankAccount account = new BankAccount(1000);
        // Withdraw amount
        account.withdraw(500);
        // Expected balance after withdrawal
        double expectedBalance = 500.0;
        // Asserting the balance
        assertEquals(expectedBalance, account.getBalance());
    }

    // Test method for insufficient balance
    @Test
    void testInsufficientBalance() {
        // Creating an object of BankAccount with initial balance
        BankAccount account = new BankAccount(1000);
        // Attempt to withdraw amount greater than balance
        assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(1500);
        });
    }

    // Test method for invalid amount (negative value)
    @Test
    void testInvalidAmount() {
        // Creating an object of BankAccount with initial balance
        BankAccount account = new BankAccount(1000);
        // Attempt to withdraw a negative amount
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-500);
        });
    }
}
