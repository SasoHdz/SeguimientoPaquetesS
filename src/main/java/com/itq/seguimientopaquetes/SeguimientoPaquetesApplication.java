package com.itq.seguimientopaquetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.itq.seguimientopaquetes.entity")
public class SeguimientoPaquetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguimientoPaquetesApplication.class, args);
	}

}
