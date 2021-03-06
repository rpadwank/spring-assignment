package com.capgemini.spring.test;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
public class TestSetterWithAnnotation
{
	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationWithSetterConfiguration.class);
		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.render();
		
	}
}