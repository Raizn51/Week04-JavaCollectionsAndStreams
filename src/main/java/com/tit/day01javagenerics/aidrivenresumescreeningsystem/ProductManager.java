package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

// Creating a class ProductManager that extends JobRole
class ProductManager extends JobRole {
    public ProductManager(String roleName) {
        super(roleName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Product Manager - Role Name: " + getRoleName());
    }
}
