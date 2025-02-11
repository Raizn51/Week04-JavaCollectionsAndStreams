package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

// Creating a class SoftwareEngineer that extends JobRole
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String roleName) {
        super(roleName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Software Engineer - Role Name: " + getRoleName());
    }
}
