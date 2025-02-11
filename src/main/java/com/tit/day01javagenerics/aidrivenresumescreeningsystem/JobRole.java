package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

// Creating an abstract class JobRole to represent different job roles
abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayRoleDetails();
}
