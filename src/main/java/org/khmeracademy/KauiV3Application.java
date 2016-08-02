package org.khmeracademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.khmeracademy")
public class KauiV3Application {

	public static void main(String[] args) {
		SpringApplication.run(KauiV3Application.class, args);
	}
}
