package org.abc.firstMavenProject;

import org.springframework.stereotype.Component;

@Component("whatsApp")
public class WhatsAppService implements IMessage{
    public void SendMessage(){
        System.out.println("Whatsapp can be used to send a message");
    }
}
