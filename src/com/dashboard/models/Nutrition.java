package com.dashboard.models;

public class Nutrition {
	
	    private int caloriesConsumed;
	    private String mealType; // Breakfast, Lunch, Dinner, Snack

	    public Nutrition(int caloriesConsumed, String mealType) {
	        this.caloriesConsumed = caloriesConsumed;
	        this.mealType = mealType;
	    }

	    public int getCaloriesConsumed() {
	        return caloriesConsumed;
	    }

	    public void setCaloriesConsumed(int caloriesConsumed) {
	        this.caloriesConsumed = caloriesConsumed;
	    }

	    public String getMealType() {
	        return mealType;
	    }

	    public void setMealType(String mealType) {
	        this.mealType = mealType;
	    }

	    public String displayNutritionInfo() {
	        return "You consumed " + caloriesConsumed + " calories during " + mealType + ".";
	    }
	}


