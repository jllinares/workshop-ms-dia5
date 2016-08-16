package org.jllinares;

import org.jllinares.services.SaludaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab05Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lab05Application.class, args);
		SaludaService service = context.getBean(SaludaService.class);
		String saludo = service.saluda("Alumnos");
		System.out.println(saludo);
	}
}
