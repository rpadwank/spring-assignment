package com.capgemini.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.*;

@Lazy
@Configuration
public class AnnotationWithSetterConfiguration {
	// equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new HWMessageProvider();
	}
	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new MessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
 	}
}