package com.axelor.service;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.axelor.pojo.Semester;
import com.axelor.pojo.User;
import com.axelor.utility.Configur;

public class Login {
	
	static User user=null;
	public static boolean ckeckLogin(String email, String password) {

		Session ss = null;
		int flag = 0;
		
		ss = Configur.createFactory().openSession(); // create session factory object
														// ss = sf.openSession();
														// System.out.println("configuration done");
		user = (User) ss.createQuery("from User where email = '" + email + "'and password = '" + password + "'").uniqueResult();

		if(user != null) {
			flag = 1;
		}
		
		ss.close();
		
		if (flag == 1)
			return true;
		else
			return false;
	}
	public static User getUser() {
		return user;
	}	
}
