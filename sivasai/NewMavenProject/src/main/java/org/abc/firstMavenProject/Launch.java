package org.abc.firstMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
    public static void main(String []args){
        //Loose coupling achieved using interface

        //if a class implements an interface we can address that class object as that interface type
        // variable or using the class name itself

//        IMessage message = new GmailService();
//        IMessage message = new FacebookService();
//        IMessage message = new WhatsAppService();

//        MessageSender msgSender = new MessageSender(message);
//        msgSender.displayOutput();

        ApplicationContext appConfig = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender ms = appConfig.getBean(MessageSender.class);
        ms.displayOutput();

//        appConfig.getBean(FacebookService.class).SendMessage();

    }
}
