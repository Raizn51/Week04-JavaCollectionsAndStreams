package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise1useoverridecorrectly;

/*
 * Exercise 1: Use @Override Correctly
 * ✅ Problem Statement:
 * Create a parent class Animal with a method makeSound(). Then, create a Dog class that overrides this method using @Override.
 * 🔹 Steps to Follow:
 * 1. Define a makeSound() method in the Animal class.
 * 2. Override it in the Dog class with @Override.
 * 3. Instantiate Dog and call makeSound().
 */

// Creating a main class to test the overridden method
public class Main {
    public static void main(String[] args) {
        // Instantiating a Dog object
        Dog dog = new Dog();
        // Calling the makeSound() method
        dog.makeSound(); // Output: Dog barks
    }
}

