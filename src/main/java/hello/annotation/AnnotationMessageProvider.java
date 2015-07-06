package hello.annotation;

import org.springframework.stereotype.Service;
import hello.MessageProvider;

@Service("messageProvider")
public class AnnotationMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "i'm a annotation message provider";
	}
}