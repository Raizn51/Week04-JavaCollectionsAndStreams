package com.tit.day01javagenerics.personalizedmealplangenerator;

/*
4. Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.
*/

// Creating a class PersonalizedMealPlanGenerator to handle the generation of personalized meal plans
public class PersonalizedMealPlanGenerator
{

    // Generic method to generate and validate a personalized meal plan
    public static <T extends MealPlan> Meal<T> generatePersonalizedMealPlan(T mealPlan) {
        // Validate the input meal plan
        if (mealPlan == null) {
            throw new IllegalArgumentException("Meal plan cannot be null.");
        }

        // Create a Meal object and validate it
        Meal<T> meal = new Meal<>(mealPlan);
        if (meal.validateMeal()) {
            // If valid, return the personalized meal plan
            System.out.println("Meal plan is valid. Generating personalized plan...");
            return meal;
        } else {
            // If invalid, throw an exception
            throw new IllegalArgumentException("Invalid meal plan.");
        }
    }

    public static void main(String[] args) {
        // Creating meal plan objects for different categories
        MealPlan vegetarianMeal = new VegetarianMeal("Vegetable Stir Fry");
        MealPlan veganMeal = new VeganMeal("Tofu Scramble");
        MealPlan ketoMeal = new KetoMeal("Chicken Avocado Salad");
        MealPlan highProteinMeal = new HighProteinMeal("Grilled Salmon");

        // Generating and displaying personalized vegetarian meal plan
        System.out.println("Generating Vegetarian Meal Plan:");
        Meal<VegetarianMeal> vegetarianMealPlan = generatePersonalizedMealPlan(new VegetarianMeal("Vegetable Stir Fry"));
        vegetarianMealPlan.getMealDetails();

        // Generating and displaying personalized vegan meal plan
        System.out.println("\nGenerating Vegan Meal Plan:");
        Meal<VeganMeal> veganMealPlan = generatePersonalizedMealPlan(new VeganMeal("Tofu Scramble"));
        veganMealPlan.getMealDetails();

        // Generating and displaying personalized keto meal plan
        System.out.println("\nGenerating Keto Meal Plan:");
        Meal<KetoMeal> ketoMealPlan = generatePersonalizedMealPlan(new KetoMeal("Chicken Avocado Salad"));
        ketoMealPlan.getMealDetails();

        // Generating and displaying personalized high-protein meal plan
        System.out.println("\nGenerating High-Protein Meal Plan:");
        Meal<HighProteinMeal> highProteinMealPlan = generatePersonalizedMealPlan(new HighProteinMeal("Grilled Salmon"));
        highProteinMealPlan.getMealDetails();
    }
}
