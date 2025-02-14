package com.tit.day05javaexceptionhandling.exceptionpropagationinmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

// Creating a class TestingExceptionPropagation to test exception propagation
class TestingExceptionPropagation
{

    // Test method for exception propagation
    @Test
    void testExceptionPropagation()
    {
        // Creating an object of ExceptionPropagation
        ExceptionPropagation ep = new ExceptionPropagation();

        // Asserting that ArithmeticException is thrown when method2 is called
        assertThrows(ArithmeticException.class, () -> {
            ep.method2();
        });
    }
}
