package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;

// Creating a class AssignmentCourse that extends CourseType
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Assignment Course - Course Name: " + getCourseName());
    }
}
