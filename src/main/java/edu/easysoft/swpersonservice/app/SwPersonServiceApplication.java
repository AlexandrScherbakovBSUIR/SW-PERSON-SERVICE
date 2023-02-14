package edu.easysoft.swpersonservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"edu.easysoft.swpersonservice.controller",
		"edu.easysoft.swpersonservice.service"})
public class SwPersonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwPersonServiceApplication.class, args);
	}

}
