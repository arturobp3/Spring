package annotationsPractice;

import annotations.FortuneService;

public class GoalFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are gonna score this time";
	}

}
