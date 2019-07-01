package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bean.Clazz;

@Configuration
@ComponentScan(basePackages= {"com"})
public class StuConfig 
{

	  @Bean
	  public Clazz createClazz()
	  {
		  Clazz clazz = new Clazz();
		  clazz.setCname("java2班");
		  
		  return clazz;
		  
	  }
}
