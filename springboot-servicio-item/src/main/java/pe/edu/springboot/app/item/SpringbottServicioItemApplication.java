package pe.edu.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SpringbottServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbottServicioItemApplication.class, args);
	}

}
