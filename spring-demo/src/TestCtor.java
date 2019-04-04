package com.capgemini.spring.test;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import com.capgemini.spring.renderer.MessageRendererCtor;
public class TestCtor
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("contextctor.xml");
		MessageRendererCtor renderer = (MessageRendererCtor)context.getBean("renderer");
		renderer.render();
		
	}
}