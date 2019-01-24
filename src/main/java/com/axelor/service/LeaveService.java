package com.axelor.service;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.axelor.pojo.Leave;
import com.axelor.pojo.User;
import com.axelor.utility.Configur;

public class LeaveService {

	public static boolean leaveApply(String lDate, String rDate, String reason, int uid) throws ParseException {
		Leave leave = new Leave();
		leave.setLeaveDate(lDate);
		leave.setReturnDate(rDate);
		leave.setReason(reason);
		leave.setAction(1);
		leave.setStatus(1);

		Transaction tr = null;
		Session ss = null;
		ss = Configur.createFactory().openSession();

		User user = ss.find(User.class, uid);
		leave.setUser(user);

		tr = ss.beginTransaction();
		int i = (int) ss.save(leave);
		tr.commit();
		ss.close();
		Configur.createFactory().close();
		System.out.println("leave add");
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}
}
