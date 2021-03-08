package com.example.Websockets;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/hello")
public class HelloWorldEndpoint {

    public HelloWorldEndpoint() {
        System.out.println("class loaded" +  this.getClass());
    }
    @OnOpen
    public void  onOpen(Session session) {
        System.out.println("Session opened, id: " + session.getId());
        try {
            session.getBasicRemote().sendText("Hi there, we are succ    essfully connected");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    @OnMessage
    public void  onMessage(Session session, String message) {
        System.out.println("Message received. Session id: " + session.getId() + " Message: " + message);
        try {
            session.getBasicRemote().sendText(String.format("We received your message: " + message));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @OnError
    public void onError(Throwable e) {e.printStackTrace();}

    @OnClose
    public void onClose(Session session){
        System.out.println("Session closed with id: " + session.getId());
    }
}
