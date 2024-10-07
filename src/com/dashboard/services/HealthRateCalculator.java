package com.dashboard.services;
import com.dashboard.models.Exercise;
import com.dashboard.models.Nutrition;
import com.dashboard.models.Sleep;
import com.dashboard.models.MentalWellBeing;
public class HealthRateCalculator {
	public static String calculateHealthRate(Exercise exercise, Nutrition nutrition, Sleep sleep, MentalWellBeing mentalWellBeing) {
        int score = 0;

        // Evaluate exercise
        if (exercise.getMinutesExercised() >= 30) {
            score += 2; // Good exercise
        } else if (exercise.getMinutesExercised() > 0) {
            score += 1; // Some exercise
        }

        // Evaluate nutrition
        if (nutrition.getCaloriesConsumed() < 2000) { // Assuming 2000 as a baseline for daily calorie intake
            score += 2; // Good nutrition
        } else {
            score += 1; // Over calorie limit
        }

        // Evaluate sleep
        if (sleep.getHoursSlept() >= 7) {
            score += 2; // Good sleep
        } else if (sleep.getHoursSlept() >= 5) {
            score += 1; // Fair sleep
        }

        // Evaluate mental well-being
        if (mentalWellBeing.getStressLevel() <= 3) {
            score += 2; // Low stress
        } else if (mentalWellBeing.getStressLevel() <= 7) {
            score += 1; // Moderate stress
        }

        // Determine health rate based on the score
        String healthRating;
        if (score >= 7) {
            healthRating = "Excellent";
        } else if (score >= 4) {
            healthRating = "Good";
        } else {
            healthRating = "Needs Improvement";
        }

        return "Your health rating is: " + healthRating;
    }
}
