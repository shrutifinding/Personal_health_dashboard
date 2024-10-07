package com.dashboard.main;

import java.util.Scanner;
import com.dashboard.models.Exercise;
import com.dashboard.models.Nutrition;
import com.dashboard.models.Sleep;
import com.dashboard.models.MentalWellBeing;
import com.dashboard.services.HealthService;
import com.dashboard.services.HealthRateCalculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input exercise data
        System.out.println("Enter minutes exercised today:");
        int minutes = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter type of exercise:");
        String exerciseType = scanner.nextLine();
        
        // Create Exercise object
        Exercise exercise = new Exercise(minutes, exerciseType);
        
        // Input nutrition data
        System.out.println("Enter total calories consumed today:");
        int calories = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter your diet type (e.g., Vegan, Keto):");
        String dietType = scanner.nextLine();
        
        // Create Nutrition object
        Nutrition nutrition = new Nutrition(calories, dietType);
        
        // Input sleep data
        System.out.println("Enter hours slept last night:");
        int hoursSlept = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter sleep quality (e.g., Good, Fair, Poor):");
        String sleepQuality = scanner.nextLine();
        
        // Create Sleep object
        Sleep sleep = new Sleep(hoursSlept, sleepQuality);
        
        // Input mental well-being data
        System.out.println("Enter your current stress level (1-10):");
        int stressLevel = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter your mood (e.g., Happy, Sad, Anxious):");
        String mood = scanner.nextLine();
        
        // Create MentalWellBeing object
        MentalWellBeing mentalWellBeing = new MentalWellBeing(stressLevel, mood);
        
        // Create HealthService object
        HealthService healthService = new HealthService(exercise, nutrition, sleep, mentalWellBeing);
        
        // Display the health dashboard
        healthService.displayDashboard();
        
        // Calculate and display health rating
        String healthRating = HealthRateCalculator.calculateHealthRate(exercise, nutrition, sleep, mentalWellBeing);
        System.out.println(healthRating);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
