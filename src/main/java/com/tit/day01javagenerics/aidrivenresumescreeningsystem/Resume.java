package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Creating a generic class Resume<T extends JobRole> to manage resumes for different job roles
class Resume<T extends JobRole> {
    private List<T> resumeList;

    public Resume() {
        resumeList = new ArrayList<>();
    }

    // Method to add a resume to the list
    public void addResume(T resume) {
        resumeList.add(resume);
    }

    // Method to remove a resume from the list
    public void removeResume(T resume) {
        resumeList.remove(resume);
    }

    // Method to get the list of resumes
    public List<T> getResumes() {
        return resumeList;
    }

    // Method to display all resumes
    public void displayAllResumes() {
        for (T resume : resumeList) {
            resume.displayRoleDetails();
        }
    }
}
