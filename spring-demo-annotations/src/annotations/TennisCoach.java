package annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Para ejecutar unas funciones justo despues de que se ejecute el constructor 
 * y de que se inyecten las dependencias, podemos usar la anotación: @PostConstruct
 * Esta anotación se puede poner en la función que deseemos. Generalmente el tipo de retorno
 * de la función es void, ya que no se puede capturar aquello que retorna y obligatoriamente no debe 
 * tener argumentos de ningun tipo.
 * 
 * Si queremos ejecutar una función antes de destruir el objeto podemos usar la anotación: @PreDestroy
 * en el método que queramos. Esta anotación no funciona en clases que tienen un scope Prototype
 * 
 * Para java 9 en adelante, esta anotación no funcionará
 * */


@Component
@Scope("singleton") //Al poner singleton o no poner nada, nos referiremos siempre al mismo objeto (@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired //Funciona como los ejemplos de abajo
	@Qualifier("randomFortuneService") //Sirve para especificar que implementación queremos. Debe ir la primera en minuscula
	private FortuneService fortuneService;
	
	@Value("${foo.email}") //Este valor se recoge del fichero sport.properties y queda configurado en el XML
	private String email;
	
	//Este ejemplo se podría hacer igual con un setter
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired  //FUNCIONA COMO EL SETTER O EL CONSTRUCTOR
	public void doSomeCrazyStuff(FortuneService s) {
		this.fortuneService = s;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley: " + email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: Inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanupStuff");
	}
	
	

}
