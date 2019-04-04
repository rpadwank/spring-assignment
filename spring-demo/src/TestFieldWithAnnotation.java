package com.capgemini.spring.test;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRendererField;
public class TestFieldWithAnnotation
{
	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(FieldWithAnnotationConfiguration.class);
		MessageRendererField renderer = context.getBean("renderer", MessageRendererField.class);
		renderer.render();
		
	}
}