package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

// @Configuration
// @ComponentScan
public class Application {

    // @Bean
    // MessageService mockMessageService() {
    //     return new MessageService() {
    //         public String getMessage() {
    //           return "Hello World!";
    //         }
    //     };
    // }

  public static void main(String[] args) {
      // test 1
      // ApplicationContext context = 
      //     new AnnotationConfigApplicationContext(Application.class);
      // MessagePrinter printer = context.getBean(MessagePrinter.class);
      // printer.printMessage();

    // test xml
    // ApplicationContext context = new ClassPathXmlApplicationContext("file:E:/Spring_test/helloworld/src/main/java/hello/app-context-xml.xml");
    // MessageProvider msgPro = context.getBean("messageProvider", MessageProvider.class);
    // MessageRenderer msgRen = context.getBean("messageRenderer", MessageRenderer.class);
    // msgRen.setMessageProvider(msgPro);
    // msgRen.render();

    // test annotation
    // ApplicationContext context = new ClassPathXmlApplicationContext("file:E:/Spring_test/helloworld/src/main/java/hello/annotation/app-context-annotation.xml");
    ApplicationContext context = new ClassPathXmlApplicationContext("file:E:/Spring_test/helloworld/src/main/java/hello/xml/app-context-xml.xml");
    MessageProvider msgPro = context.getBean("messageProvider", MessageProvider.class);
    MessageRenderer msgRen = context.getBean("messageRenderer", MessageRenderer.class);
    msgRen.setMessageProvider(msgPro);
    msgRen.render();
  }
}