package com.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfgiuration {

	@Bean("home")
	public Address getHomeAddess() {
		return new Address();
	}

}
