package com.tit.day01javagenerics.personalizedmealplangenerator;

// Creating a HighProteinMeal class that implements the MealPlan interface
class HighProteinMeal implements MealPlan {
    private String mealName;

    // Constructor to initialize the meal name
    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    // Implementing the displayMealPlanDetails method to show details for a high-protein meal
    @Override
    public void displayMealPlanDetails() {
        System.out.println("High-Protein Meal - " + mealName);
    }
}
