package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

//@Component("renderer")
public class MessageRenderer{
	private MessageProvider messageProvider;
	public void render()
	{
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider = messageProvider;
	}
}
		