package com.axelor.service;

import java.text.ParseException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.axelor.pojo.Message;
import com.axelor.pojo.User;
import com.axelor.utility.Configur;

public class MessageService {
	static Message text = new Message();
	
	private static Transaction tr = null;
	private static Session ss = null;
	
	public static boolean addMessage(int uid,String name,String message) throws ParseException {
		
		ss = Configur.createFactory().openSession();

		text.setUid(uid);
		text.setName(name);
		text.setMessage(message);
		
		tr = ss.beginTransaction();
		int i = (int) ss.save(text);
		tr.commit();
		ss.close();
		Configur.createFactory().close();
		System.out.println("message add");
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static List<Message> getMessage() throws ParseException {
		
		ss = Configur.createFactory().openSession(); 
		List<Message> messages = (List<com.axelor.pojo.Message>) ss.createQuery("from Message order by id DESC").list();
		ss.close();
		if(messages != null) {
			System.out.println("message not null");
			return messages;
		}
		else {
			System.out.println("message null");
			return null;
		}
	}
	
}
