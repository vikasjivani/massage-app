package com.axelor.guice;



import com.axelor.messageservice.LowerCase;
import com.axelor.messageservice.Message;
import com.axelor.messageservice.UpperCase;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ServiceConfigur extends AbstractModule{
	private String text;
	public ServiceConfigur(String text) {
		this.text = text;
	}
	
	
	@Override
	public void configure() {
		
	}
	
	@Provides
	public Message getMessage()
	{
		if(text.equals("UpperCase")) {
			return new UpperCase();
		}
		else {
			return new LowerCase();
		}
		
	}

}
