package com.capgemini.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.renderer.MessageRendererCtor;
import com.capgemini.spring.provider.*;
@Configuration
public class AnnotationWithConstructorConfiguration {
	/* equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new HWMessageProvider();
	}*/
	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRendererCtor renderer(){
		MessageRendererCtor renderer = new MessageRendererCtor(new GMMessageProvider());
		return renderer;
 	}
}