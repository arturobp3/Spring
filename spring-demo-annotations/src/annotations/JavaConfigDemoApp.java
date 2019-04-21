package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		/*
		 * Al cambiar el scope de la clase, variamos entre crear una instancia en cada referencia a esa clase
		 * ("prototype") ó referirnos siempre a la misma instancia ("singleton")
		 * */
		
		
		// load spring config class 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		
		System.out.println("\nBean creado swimCoach: " + theCoach.getDailyFortune());
		
		
		context.close();
		

	}

}
