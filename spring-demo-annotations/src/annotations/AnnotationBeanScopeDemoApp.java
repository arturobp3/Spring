package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		/*
		 * Al cambiar el scope de la clase, variamos entre crear una instancia en cada referencia a esa clase
		 * ("prototype") ó referirnos siempre a la misma instancia ("singleton")
		 * */
		
		
		// load spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		
		context.close();
		

	}

}
