package com.tit.day01javagenerics.personalizedmealplangenerator;

// Creating a generic class Meal<T extends MealPlan> to manage meal plans for different types
class Meal<T extends MealPlan> {
    private T meal;

    // Constructor to initialize the meal
    public Meal(T meal) {
        this.meal = meal;
    }

    // Method to get and display the meal details
    public void getMealDetails() {
        meal.displayMealPlanDetails();
    }

    // Method to validate the meal, ensuring it is not null
    public boolean validateMeal() {
        return meal != null; // Validate if meal is not null
    }
}
