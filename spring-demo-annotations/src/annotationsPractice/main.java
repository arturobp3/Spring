package annotationsPractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotations.Coach;

public class main {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(footballConfig.class);
		
		
		Coach ourFootballCoach = context.getBean("footballCoach", Coach.class);
		
		
		System.out.println(ourFootballCoach.getDailyFortune());
		System.out.println(ourFootballCoach.getDailyWorkout());
		
		
		

	}

}
