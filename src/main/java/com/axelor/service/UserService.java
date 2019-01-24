package com.axelor.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.axelor.pojo.User;
import com.axelor.utility.Configur;


/* only for rest easy prectice */


public class UserService {
	
	public List<User> getAllUser(){
		Session ss = null;
		
		ss = Configur.createFactory().openSession(); 
		List<User> users = (List<User>) ss.createQuery("from User").list();
		ss.close();
		List<User> user = new ArrayList<>();
		for(User u :users) {
			User newuser = new User();
			newuser.setName(u.getName());
			newuser.setUid(u.getUid());
			newuser.setEnNo(u.getEnNo());
			newuser.setEmail(u.getEmail());
			user.add(newuser);
			
		}
		return user;
	}
}	
