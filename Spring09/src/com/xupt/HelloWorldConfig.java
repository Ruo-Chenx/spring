package com.xupt;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class HelloWorldConfig {
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
