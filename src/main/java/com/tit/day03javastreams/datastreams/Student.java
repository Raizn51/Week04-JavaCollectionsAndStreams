package com.tit.day03javastreams.datastreams;

import java.io.Serializable;

// Creating a class Student to represent a student
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int rollNumber;
    private String name;
    private double gpa;

    // Constructor
    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
