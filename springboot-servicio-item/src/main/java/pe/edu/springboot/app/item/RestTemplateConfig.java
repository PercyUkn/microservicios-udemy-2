package pe.edu.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean("clienteRest") // Por defecto adopta el nombre del método como nombre del bean o componente de Spring
	public RestTemplate registratRestTemplate() {
		return new RestTemplate();
	}
	
}
