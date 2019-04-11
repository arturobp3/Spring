package spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_demo_one.IoC_DI.CricketCoach;

public class HelloSpringApp {

	public static void main(String[] args) {
	
		//Cargamos el archivo de configuración de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//Recuperamos el bean del contenedor de Spring (Se pone el id del bean y la interfaz que implementa)
		Coach trackCoach = context.getBean("myCoach", Coach.class);
		
		Coach baseballCoach = context.getBean("myCoach2", Coach.class);
		
		Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
		
		CricketCoach ck = context.getBean("myCricketCoach", CricketCoach.class);
		
		
		
		
		//Llamamos a los metodos sobre el bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println(ck.getEmailAddress());
		System.out.println(ck.getTeam());
		
		//Cerramos el contexto
		context.close();

	}

}
