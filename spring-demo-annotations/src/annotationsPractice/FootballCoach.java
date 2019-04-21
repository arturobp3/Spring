package annotationsPractice;

import annotations.Coach;
import annotations.FortuneService;

public class FootballCoach implements Coach {
	
	FortuneService fortuneService;
	

	public FootballCoach(FortuneService goalFortuneService) {
		this.fortuneService = goalFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Score 10 goals today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
