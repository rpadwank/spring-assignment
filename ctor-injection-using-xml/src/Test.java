package com.capgemini.spring.test;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import com.capgemini.spring.renderer.MessageRendererCtor;
public class Test
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("contextctor.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("contextstrantn.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("contextctorantn.xml");
		MessageRendererCtor renderer = (MessageRendererCtor)context.getBean("renderer");
		renderer.render();
		
	}
}