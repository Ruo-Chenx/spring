package com.xzy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations="ApplicationContext.xml")
@EnableAspectJAutoProxy
public class AllConfig {
	
}
