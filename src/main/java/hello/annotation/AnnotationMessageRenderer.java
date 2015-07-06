package hello.annotation;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import hello.MessageRenderer;
import hello.MessageProvider;

@Service("messageRenderer")
public class AnnotationMessageRenderer implements MessageRenderer{
	private MessageProvider msgPro;
	@Override
	public void render(){
		if (msgPro == null){
			throw new RuntimeException("no msg provider");
		}
		System.out.println(msgPro.getMessage());
	}

	@Override
	@Autowired
	public void setMessageProvider(MessageProvider provider){
		this.msgPro = provider;
	}

	@Override
	public MessageProvider getMessageProvider(){
		return this.msgPro;
	}


}