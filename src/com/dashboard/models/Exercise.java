package com.dashboard.models;

public class Exercise {
	 private int minutesExercised;
	    private String typeOfExercise;

	    public Exercise(int minutesExercised, String typeOfExercise) {
	        this.minutesExercised = minutesExercised;
	        this.typeOfExercise = typeOfExercise;
	    }

	    public int getMinutesExercised() {
	        return minutesExercised;
	    }

	    public void setMinutesExercised(int minutesExercised) {
	        this.minutesExercised = minutesExercised;
	    }

	    public String getTypeOfExercise() {
	        return typeOfExercise;
	    }

	    public void setTypeOfExercise(String typeOfExercise) {
	        this.typeOfExercise = typeOfExercise;
	    }

	    public String displayExerciseInfo() {
	        return "You exercised for " + minutesExercised + " minutes doing " + typeOfExercise;
	    }
}
