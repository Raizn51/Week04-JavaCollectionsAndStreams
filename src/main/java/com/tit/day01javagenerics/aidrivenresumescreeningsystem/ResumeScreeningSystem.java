package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

import java.util.List;

// Creating a class ResumeScreeningSystem to handle resumes of different job roles dynamically
class ResumeScreeningSystem {
    public static void displayAllResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayRoleDetails();
        }
    }
}
