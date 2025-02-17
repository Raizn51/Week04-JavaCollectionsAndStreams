package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise1useoverridecorrectly;

import java.io.*;

import com.tit.day06javaannotationsandreflection.annotations.exercise.exercise1useoverridecorrectly.Animal;
import com.tit.day06javaannotationsandreflection.annotations.exercise.exercise1useoverridecorrectly.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingAnimal to test Animal and Dog classes
public class TestingAnimal {

    // Test method for the Animal class
    @Test
    void testAnimalMakeSound() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Instantiate an Animal object and call makeSound()
        Animal animal = new Animal();
        animal.makeSound();

        // Expected output
        String expectedOutput = "Animal makes a sound\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test method for the Dog class
    @Test
    void testDogMakeSound() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Instantiate a Dog object and call makeSound()
        Dog dog = new Dog();
        dog.makeSound();

        // Expected output
        String expectedOutput = "Dog barks\r\n";

        // Asserting the output
        assertEquals(expectedOutput, outContent.toString());
    }
}
