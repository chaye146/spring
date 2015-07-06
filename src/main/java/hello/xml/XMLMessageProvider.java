package hello.xml;

import hello.MessageProvider;

public class XMLMessageProvider implements MessageProvider {
	private String msg;
	public XMLMessageProvider(String msg){
		this.msg = msg;
	}
	@Override
	public String getMessage(){
		return msg;
	}

}