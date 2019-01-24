package com.axelor.messageservice;

public  class LowerCase implements Message{

	@Override
	public String getMessage(String text) {
		
		return text.toLowerCase();
	}

}
