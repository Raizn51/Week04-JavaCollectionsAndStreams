package com.tit.day02javacollections.setinterface.insurancepolicymanagementsystem;

import java.util.Date;

// Creating a class Policy to represent an insurance policy
public class Policy
{
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Constructor for the Policy class
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
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

    // Getter for the coverage type
    public String getCoverageType() {
        return coverageType;
    }

    // Getter for the premium amount
    public double getPremiumAmount() {
        return premiumAmount;
    }

    // Overriding the equals method to compare policies by policy number
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    // Overriding the hashCode method to generate hash code based on policy number
    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    // Overriding the toString method to return a string representation of the policy
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
