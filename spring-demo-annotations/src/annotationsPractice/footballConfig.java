package annotationsPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import annotations.Coach;
import annotations.FortuneService;

@Configuration
public class footballConfig {

	
	@Bean
	public FortuneService goalFortuneService() {
		return new GoalFortuneService();
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach( goalFortuneService() );
	}
}
