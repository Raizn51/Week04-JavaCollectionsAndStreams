package com.tit.day01javagenerics.personalizedmealplangenerator;

// Creating a VegetarianMeal class that implements the MealPlan interface
class VegetarianMeal implements MealPlan {
    private String mealName;

    // Constructor to initialize the meal name
    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    // Implementing the displayMealPlanDetails method to show details for a vegetarian meal
    @Override
    public void displayMealPlanDetails() {
        System.out.println("Vegetarian Meal - " + mealName);
    }
}
