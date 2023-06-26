package org.abc.firstMavenProject;


import org.springframework.stereotype.Component;

@Component("facebook")
public class FacebookService implements IMessage{
    public void SendMessage(){
        System.out.println("Facebook can be used to send a message");
    }
}
