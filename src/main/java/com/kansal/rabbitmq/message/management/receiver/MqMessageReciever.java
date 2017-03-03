package com.kansal.rabbitmq.message.management.receiver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kansal.rabbitmq.message.management.model.UserInfo;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * Created by tarunkansal on 2/12/17.
 */
@Component
public class MqMessageReciever {

    @RabbitListener(queues = "rabbitQueue")
    public void processMessage(Message message) throws UnsupportedEncodingException {
        String messageBody = new String(message.getBody(), "UTF-8");
        System.out.println(messageBody);
    }

    @RabbitListener(queues = "rabbitObjectQueue")
    public void processObjectMessage(UserInfo userInfo) throws UnsupportedEncodingException {
        System.out.println(userInfo);
    }

    @RabbitListener(queues = "appleQueue")
    public void processAppleObjectMessage(UserInfo userInfo) throws UnsupportedEncodingException {
        System.out.println("Message Recieved in apple queue: " + userInfo);
    }

    @RabbitListener(queues = "sprintQueue")
    public void processSprintObjectMessage(UserInfo userInfo) throws UnsupportedEncodingException {
        System.out.println("Message Recieved in sprint queue: " + userInfo);
    }

    @RabbitListener(queues = "googleQueue")
    public void processGoogleObjectMessage(UserInfo userInfo) throws UnsupportedEncodingException {
        System.out.println("Message Recieved in google queue: " + userInfo);
    }

    @RabbitListener(queues = "amazonQueue")
    public void processAmazonObjectMessage(UserInfo userInfo) throws UnsupportedEncodingException {
        System.out.println("Message Recieved in amazon queue: " + userInfo);
    }
}
