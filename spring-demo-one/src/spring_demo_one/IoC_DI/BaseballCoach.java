package spring_demo_one.IoC_DI;

import spring_demo_one.Coach;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pasa 30 minutos bateando";
	}

	//We use our dependency
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
}
