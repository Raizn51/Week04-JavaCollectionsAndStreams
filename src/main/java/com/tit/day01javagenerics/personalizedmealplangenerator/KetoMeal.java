package com.tit.day01javagenerics.personalizedmealplangenerator;

// Creating a KetoMeal class that implements the MealPlan interface
class KetoMeal implements MealPlan {
    private String mealName;

    // Constructor to initialize the meal name
    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    // Implementing the displayMealPlanDetails method to show details for a keto meal
    @Override
    public void displayMealPlanDetails() {
        System.out.println("Keto Meal - " + mealName);
    }
}
