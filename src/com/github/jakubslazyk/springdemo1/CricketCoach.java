package com.github.jakubslazyk.springdemo1;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	//add new fiels email and team
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	private String team;
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach:setter email");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:setter team");
		this.team = team;
	}

	public CricketCoach() {
		//System.out.println("CricketCoach:inside no-arg construtor");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach:inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
