package com.github.jakubslazyk.springdemo1;

public class SwimingCoach implements Coach {

	private RandomFortuneService myService;
	@Override
	public String getDailyWorkout() {
		return "Swim 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public SwimingCoach(RandomFortuneService myService) {
		
		this.myService = myService;
	}

	public void startupStaff(){
		System.out.println("Stuff made at startup");
	}
	public void cleanupStaff(){
		System.out.println("Stuff made at closing");
	}

	public RandomFortuneService getMyService() {
		return myService;
	}

	public void setMyService(RandomFortuneService myService) {
		this.myService = myService;
	}

}
