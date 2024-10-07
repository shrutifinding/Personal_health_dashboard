package com.dashboard.models;

public class MentalWellBeing {
	private String mood; // Happy, Sad, Neutral, etc.
    private int stressLevel; // Low, Medium, High

    public MentalWellBeing(int stressLevel, String mood) {
        this.mood = mood;
        this.stressLevel = stressLevel;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int stressLevel) {
        this.stressLevel = stressLevel;
    }

    public String displayMentalWellBeingInfo() {
        return "Your mood is " + mood + " and your stress level is " + stressLevel + ".";
    }
}
