package com.kansal.rabbitmq.message.management;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitReceiverApplication.class, args);
	}
}
