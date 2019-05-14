package com.bridgeit.usingjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
	
		@Bean
	   @Lazy(value = true)
	   public Abean getBeanOne() {
	      return new Abean();
	   }

		@Bean
	   public Bbean getBeanTwo() {
	      return new Bbean();
	   }
}
