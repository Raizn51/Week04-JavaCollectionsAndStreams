package com.tit.day02javacollections.queueinterface.hospitaltriagesystem;

import java.util.*;

// Creating a class Patient to represent a patient in the triage system
public class Patient
{
    private String name;
    private int severity;

    // Constructor for the Patient class
    public Patient(String name, int severity)
    {
        this.name = name;
        this.severity = severity;
    }

    // Getter for the patient's name
    public String getName() {
        return name;
    }

    // Getter for the patient's severity
    public int getSeverity() {
        return severity;
    }

    // Overriding the equals method to compare patients by name and severity
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return severity == patient.severity && Objects.equals(name, patient.name);
    }

    // Overriding the hashCode method to generate hash code based on name and severity
    @Override
    public int hashCode() {
        return Objects.hash(name, severity);
    }

    // Overriding the toString method to return a string representation of the patient
    @Override
    public String toString() {
        return "Patient{name='" + name + "', severity=" + severity + '}';
    }
}
