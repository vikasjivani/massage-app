package com.axelor.service;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.axelor.pojo.Semester;
import com.axelor.pojo.User;
import com.axelor.utility.Configur;

public class Login {
	public static boolean ckeckLogin(String email, String password) {

		Session ss = null;
		int flag = 0;
		ss = Configur.createFactory().openSession(); // create session factory object
														// ss = sf.openSession();
														// System.out.println("configuration done");
		List<User> user = ss.createQuery("from User where email = '" + email + "'and password = '" + password + "'").list();

		for (User u : user) {
			flag = 1;
			System.out.println("\n\n" + u.getName());
			Set<Semester> sem = u.getSemesters();

			for (Semester s : sem) {
				System.out.println("\n" + s.getSem());
			}
		}

		if (flag == 1)
			return true;
		else
			return false;
	}
}
