package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise2usedeprecatedtomarkoldmethod;

// Creating a class LegacyAPI with deprecated and new methods
public class LegacyAPI {

    // Deprecated old method
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature");
    }

    // New method
    public void newFeature() {
        System.out.println("This is the new feature");
    }
}
