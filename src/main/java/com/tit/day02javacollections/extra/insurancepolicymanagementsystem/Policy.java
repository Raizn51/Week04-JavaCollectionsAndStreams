package com.tit.day02javacollections.extra.insurancepolicymanagementsystem;


import java.util.Date;
import java.util.Objects;

// Creating a class Policy to represent an insurance policy
public class Policy {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;

    // Constructor for the Policy class
    public Policy(String policyNumber, String policyholderName, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    // Getter for the policy number
    public String getPolicyNumber() {
        return policyNumber;
    }

    // Getter for the policyholder name
    public String getPolicyholderName() {
        return policyholderName;
    }

    // Getter for the expiry date
    public Date getExpiryDate() {
        return expiryDate;
    }

    // Overriding the equals method to compare policies by policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    // Overriding the hashCode method to generate hash code based on policy number
    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    // Overriding the toString method to return a string representation of the policy
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
