package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
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
	
	

}
