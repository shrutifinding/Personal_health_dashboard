package com.dashboard.models;

public class Sleep {
	 private int hoursSlept;
	    private String sleepQuality; // Poor, Fair, Good, Excellent

	    public Sleep(int hoursSlept, String sleepQuality) {
	        this.hoursSlept = hoursSlept;
	        this.sleepQuality = sleepQuality;
	    }

	    public int getHoursSlept() {
	        return hoursSlept;
	    }

	    public void setHoursSlept(int hoursSlept) {
	        this.hoursSlept = hoursSlept;
	    }

	    public String getSleepQuality() {
	        return sleepQuality;
	    }

	    public void setSleepQuality(String sleepQuality) {
	        this.sleepQuality = sleepQuality;
	    }

	    public String displaySleepInfo() {
	        return "You slept for " + hoursSlept + " hours and rated your sleep quality as " + sleepQuality + ".";
	    }
}
