package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise1useoverridecorrectly;

// Creating a subclass Dog that extends Animal
public class Dog extends Animal {
    // Overriding the makeSound() method from the Animal class using @Override
    @Override
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
}

