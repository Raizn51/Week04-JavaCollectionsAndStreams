package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;

// Creating an abstract class CourseType to represent the evaluation types
abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayCourseDetails();
}
