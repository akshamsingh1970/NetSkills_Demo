package org.abc.firstMavenProject;

import org.springframework.stereotype.Component;

@Component("gmail")
public class GmailService implements IMessage{
    public void SendMessage(){
        System.out.println("Gmail can be used to send a message");
    }
}
