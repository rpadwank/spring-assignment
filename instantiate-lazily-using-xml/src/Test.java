package com.capgemini.spring.test;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
public class Test
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("contextstrantn.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("contextctorantn.xml");
		MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
		MessageRenderer renderer2 = (MessageRenderer)context.getBean("renderer");
		System.out.println(renderer.equals(renderer2));
		//renderer.render();
		
	}
}