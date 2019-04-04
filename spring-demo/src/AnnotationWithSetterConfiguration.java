package com.capgemini.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.*;
@Configuration
public class AnnotationWithSetterConfiguration {
	// equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new GMMessageProvider();
	}
	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new MessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
 	}
}