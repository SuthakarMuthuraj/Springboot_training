package com.activeMQ.SpringBootActiveMQ.listener;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SearchManagerListener {

	@JmsListener(destination = "in.search")
	@SendTo("out.search")
	public String receiveSearchMessage(Message message) {

		System.out.println("Received message " + message);
		return "received Successfully";
	}

}
