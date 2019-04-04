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
		MessageRenderer renderer2 = context.getBean("renderer", MessageRenderer.class);
		if(renderer==renderer2)
			System.out.println("Singleton");
		else
			System.out.println("Non singleton");
		//renderer.render();
		
	}
}