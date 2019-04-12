package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		//Se puede usar ese default id: tennisCoach o poner un id cualquiera
		//y en su clase poner @Component("nombreDelIdEscogido)
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
