package com.tit.day05javaexceptionhandling.banktransactionsystemcheckedcustomexception;

// Creating a custom exception called InsufficientBalanceException
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message); // Pass the message to the superclass constructor
    }
}

