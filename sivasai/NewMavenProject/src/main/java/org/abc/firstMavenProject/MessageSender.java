package org.abc.firstMavenProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msgSender")
public class MessageSender {

    IMessage service;

//    WhatsAppService service;
    public MessageSender(@Qualifier("whatsApp") IMessage service){
        this.service = service;
    }

    public void displayOutput(){
        service.SendMessage();
    }
}
