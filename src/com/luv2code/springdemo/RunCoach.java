package com.luv2code.springdemo;

public class RunCoach implements Coach {

	private FortuneService fortuneService;

	public RunCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run rabbit run";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
