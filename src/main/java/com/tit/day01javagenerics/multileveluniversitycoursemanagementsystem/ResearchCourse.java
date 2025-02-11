package com.tit.day01javagenerics.multileveluniversitycoursemanagementsystem;

// Creating a class ResearchCourse that extends CourseType
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Research Course - Course Name: " + getCourseName());
    }
}
