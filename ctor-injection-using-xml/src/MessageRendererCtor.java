package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("renderer")
public class MessageRendererCtor{
	private MessageProvider messageProvider;
	@Autowired
	public MessageRendererCtor(MessageProvider messageProvider){
		this.messageProvider = messageProvider;
	}
	public void render()
	{
		System.out.println(messageProvider.getMessage());
	}
	/*public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider = messageProvider;
	}*/
}