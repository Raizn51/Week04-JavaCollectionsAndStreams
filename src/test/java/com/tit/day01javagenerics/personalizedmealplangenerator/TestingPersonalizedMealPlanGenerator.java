package com.tit.day01javagenerics.personalizedmealplangenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingPersonalizedMealPlanGenerator for testing the Personalized Meal Plan Generator
public class TestingPersonalizedMealPlanGenerator {

    // Test case to check if a vegetarian meal plan is correctly generated
    @Test
    public void testGenerateVegetarianMealPlan() {
        // Creating a vegetarian meal plan object
        MealPlan vegetarianMeal = new VegetarianMeal("Vegetable Stir Fry");

        // Generating a personalized meal plan for vegetarian
        Meal<VegetarianMeal> meal = PersonalizedMealPlanGenerator.generatePersonalizedMealPlan(new VegetarianMeal("Vegetable Stir Fry"));

        // Assert that the generated meal plan is valid and not null
        assertNotNull(meal, "Vegetarian meal plan should not be null.");
    }

    // Test case to check if a vegan meal plan is correctly generated
    @Test
    public void testGenerateVeganMealPlan() {
        // Creating a vegan meal plan object
        MealPlan veganMeal = new VeganMeal("Tofu Scramble");

        // Generating a personalized meal plan for vegan
        Meal<VeganMeal> meal = PersonalizedMealPlanGenerator.generatePersonalizedMealPlan(new VeganMeal("Tofu Scramble"));

        // Assert that the generated meal plan is valid and not null
        assertNotNull(meal, "Vegan meal plan should not be null.");
    }

    // Test case to check if a keto meal plan is correctly generated
    @Test
    public void testGenerateKetoMealPlan() {
        // Creating a keto meal plan object
        MealPlan ketoMeal = new KetoMeal("Chicken Avocado Salad");

        // Generating a personalized meal plan for keto
        Meal<KetoMeal> meal = PersonalizedMealPlanGenerator.generatePersonalizedMealPlan(new KetoMeal("Chicken Avocado Salad"));

        // Assert that the generated meal plan is valid and not null
        assertNotNull(meal, "Keto meal plan should not be null.");
    }

    // Test case to check if a high-protein meal plan is correctly generated
    @Test
    public void testGenerateHighProteinMealPlan() {
        // Creating a high-protein meal plan object
        MealPlan highProteinMeal = new HighProteinMeal("Grilled Salmon");

        // Generating a personalized meal plan for high-protein
        Meal<HighProteinMeal> meal = PersonalizedMealPlanGenerator.generatePersonalizedMealPlan(new HighProteinMeal("Grilled Salmon"));

        // Assert that the generated meal plan is valid and not null
        assertNotNull(meal, "High-Protein meal plan should not be null.");
    }

    // Test case to ensure meal plan generation throws an exception when meal plan is null
    @Test
    public void testGenerateMealPlanWithNull() {
        // Attempting to generate a meal plan with a null value
        assertThrows(IllegalArgumentException.class, () -> {
            // Calling the generate method with a null meal plan should throw an exception
            PersonalizedMealPlanGenerator.generatePersonalizedMealPlan(null);
        }, "Meal plan cannot be null.");
    }
}

