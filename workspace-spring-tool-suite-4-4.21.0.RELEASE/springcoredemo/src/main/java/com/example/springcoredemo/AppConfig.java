package com.example.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Vehicle returnCarObj() {
		return new Car();
	}
	
	@Bean
	public Vehicle returnCycleObj() {
		return new Cycle();
	}
	
	@Bean
	public Vehicle returnBikeObj() {
		return new Bike();
	}
	
	@Bean
	public Traveller returnTravellerObj() {
		return new Traveller(returnBikeObj());
	}
}
