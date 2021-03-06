package com.Igunza.CarManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"controller","services","repositories","com.Igunza.CarManagementApp"})
@EnableJpaRepositories("repositories")
@EntityScan("model")
@EnableJpaAuditing(auditorAwareRef="auditorAware")
public class CarManagementAppApplication {
	
	@Bean
	public AuditorAware<String> auditorAware(){
		return new SpringSecurityAuditionAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(CarManagementAppApplication.class, args);
	}

}
