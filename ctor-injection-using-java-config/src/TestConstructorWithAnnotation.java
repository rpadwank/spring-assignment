package com.capgemini.spring.test;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRendererCtor;
public class TestConstructorWithAnnotation
{
	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationWithConstructorConfiguration.class);
		MessageRendererCtor renderer = context.getBean("renderer", MessageRendererCtor.class);
		renderer.render();
		
	}
}