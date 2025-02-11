package com.tit.day01javagenerics.personalizedmealplangenerator;

// Creating a VeganMeal class that implements the MealPlan interface
class VeganMeal implements MealPlan {
    private String mealName;

    // Constructor to initialize the meal name
    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    // Implementing the displayMealPlanDetails method to show details for a vegan meal
    @Override
    public void displayMealPlanDetails() {
        System.out.println("Vegan Meal - " + mealName);
    }
}
