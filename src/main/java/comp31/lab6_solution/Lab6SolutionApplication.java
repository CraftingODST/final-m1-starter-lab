package comp31.lab6_solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import comp31.lab6_solution.service.InitService;

@SpringBootApplication
public class Lab6SolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab6SolutionApplication.class, args);
	}

	@SuppressWarnings("unused")
	@Bean
	CommandLineRunner startUp(InitService initService) {

		return args -> {
			initService.initEvents();
		};
	}

}
