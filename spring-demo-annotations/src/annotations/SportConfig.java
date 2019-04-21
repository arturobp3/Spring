package annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * Esta clase funciona como el archivo XML de configuraci�n, a�adiendo la anotacion @Configuration
 * @ComponentScan permite escanear los componentes de un paquete
 */


@Configuration
//@ComponentScan("annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	/*
	 * Los Beans se van definiendo individualmente en esta clase. El Bean ID registrado
	 * en el contenedor ser� el nombre de la funci�n que pongas aqu�.
	 * 
	 * Para inyectar las dependencias, tendremos que hacer el paso que hay indicado m�s abajo.
	 * Llamar a la funcion del Bean
	 * 
	 * Tambien se puede inyectar de esta forma, sin usar ComponentScan
	 */
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	

	@Bean
	public Coach swimCoach( FortuneService fortuneService) {
		return new SwimCoach( sadFortuneService() ); //Inyectamos la dependencia
	}
	
}
