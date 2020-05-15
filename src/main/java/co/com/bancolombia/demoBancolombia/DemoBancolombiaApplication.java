package co.com.bancolombia.demoBancolombia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoBancolombiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBancolombiaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(VariablesMap variablesMap){
		return args -> {
			System.out.println(variablesMap.getName());
			System.out.println(variablesMap.getAge());
		};
	}
}



