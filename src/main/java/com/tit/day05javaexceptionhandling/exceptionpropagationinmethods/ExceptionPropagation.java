package com.tit.day05javaexceptionhandling.exceptionpropagationinmethods;

// Creating a class ExceptionPropagation to handle exception propagation
public class ExceptionPropagation
{

    // Method 1: Throws an ArithmeticException (10 / 0)
    public void method1()
    {
        // This line will throw an ArithmeticException
        int result = 10 / 0;
    }

    // Method 2: Calls method1()
    public void method2()
    {
        // Calling method1 which throws an ArithmeticException
        method1();
    }
}
