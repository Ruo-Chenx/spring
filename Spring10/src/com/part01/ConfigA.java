package com.part01;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ConfigA {
	
	@Bean
	   public A a() {
	      return new A(); 
	   }
}
