package cl.alienxander.taskapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * 
 * @author Alexander Beck
 * @version 1.0
 * {@summary Clase de inicialización de la aplicación}
 */

@SpringBootApplication
public class TaskApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApiApplication.class, args);
	}
	
	/**
	 * <p>Este método define el bean de inicialización de los mensajes. Este se define con el encoding ISO-8859-1, para que acepte los acentos.</p>
	 * @return Objeto de tipo MessageSource
	 * @since 1.0
	 */
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("ISO-8859-1");
		
		return messageSource;
	}

}
