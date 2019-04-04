package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.MessageProvider;


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
		