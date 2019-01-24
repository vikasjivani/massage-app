package com.axelor.messageservice;

public class UpperCase implements Message{

	@Override
	public String getMessage(String text) {
		
		return text.toUpperCase();
	}

}
