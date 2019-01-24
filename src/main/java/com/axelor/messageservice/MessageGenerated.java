package com.axelor.messageservice;

import com.google.inject.Inject;

public class MessageGenerated {
	public Message message;
	@Inject
	public MessageGenerated(Message message) {
		this.message=message;
	}
	public String getMessage(String text) {
		return message.getMessage(text);
	}
	
}
