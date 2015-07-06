package hello.xml;

import hello.MessageRenderer;
import hello.MessageProvider;

public class XMLMessageRenderer implements MessageRenderer{
	private MessageProvider messageProvider;

	@Override
	public void render(){
		if (messageProvider == null){
			throw new RuntimeException("xxxx Exception xxxx");
		}

		System.out.println(messageProvider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider provider){
		this.messageProvider = provider;
	}

	@Override
	public MessageProvider getMessageProvider(){
		return this.messageProvider;
	}


}