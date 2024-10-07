package com.dashboard.services;

import com.dashboard.models.Exercise;
import com.dashboard.models.Nutrition;
import com.dashboard.models.Sleep;
import com.dashboard.models.MentalWellBeing;

public class HealthService {
    private Exercise exercise;
    private Nutrition nutrition;
    private Sleep sleep;
    private MentalWellBeing mentalWellBeing;

    // Constructor to initialize the health metrics
    public HealthService(Exercise exercise, Nutrition nutrition, Sleep sleep, MentalWellBeing mentalWellBeing) {
        this.exercise = exercise;
        this.nutrition = nutrition;
        this.sleep = sleep;
        this.mentalWellBeing = mentalWellBeing;
    }

    // Method to update exercise details
    public void updateExercise(int minutes, String type) {
        exercise.setMinutesExercised(minutes);
        exercise.setTypeOfExercise(type);
    }

    // Method to update nutrition details
    public void updateNutrition(int calories, String dietType) {
        nutrition.setCaloriesConsumed(calories);
        nutrition.setMealType(dietType);
    }

    // Method to update sleep details
    public void updateSleep(int hours, String quality) {
        sleep.setHoursSlept(hours);
        sleep.setSleepQuality(quality);
    }

    // Method to update mental well-being details
    public void updateMentalWellBeing(int stressLevel, String mood) {
        mentalWellBeing.setStressLevel(stressLevel);
        mentalWellBeing.setMood(mood);
    }

    // Method to display the health dashboard
    public void displayDashboard() {
        System.out.println("Health Dashboard:");
        System.out.println("-----------------------------");
        System.out.println(exercise.displayExerciseInfo());
        if (nutrition != null) {
            System.out.println(nutrition.displayNutritionInfo());
        }
        if (sleep != null) {
            System.out.println(sleep.displaySleepInfo());
        }
        if (mentalWellBeing != null) {
            System.out.println(mentalWellBeing.displayMentalWellBeingInfo());
        }
        System.out.println("-----------------------------");
    }
}
