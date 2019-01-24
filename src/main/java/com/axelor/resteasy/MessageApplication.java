package com.axelor.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;



public class MessageApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();  
	   
    public MessageApplication() {  
        singletons.add(new LoginService());
    }  
   
    @Override 
    public Set<Object> getSingletons() {  
        return singletons;  
    }  

}
