package com.tit.day05javaexceptionhandling.customexception;

// Creating a custom exception called InvalidAgeException
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        // Pass the message to the superclass constructor
        super(message);
    }
}

