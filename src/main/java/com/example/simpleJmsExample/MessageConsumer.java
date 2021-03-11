package com.example.simpleJmsExample;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.logging.Level;
import java.util.logging.Logger;

@JMSDestinationDefinition(
        name = "java:global/queue/simpleQ",
        interfaceName = "javax.jms.Queue",
        destinationName = "simpleQ"
)
@MessageDriven(
        activationConfig = {
                @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:global/queue/simpleQ"),
                @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
        }
)
public class MessageConsumer implements MessageListener {

    public MessageConsumer() {
    }

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("Message received" + message.getBody(String.class));
        } catch (JMSException ex) {
            Logger.getLogger(MessageConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
