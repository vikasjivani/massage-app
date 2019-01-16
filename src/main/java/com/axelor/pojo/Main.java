package com.axelor.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {

	public static void main(String args[]) {
		Configuration con;
		SessionFactory sf;
		Session ss;
		Transaction tr;
		Query query;

		User stu1 = new User();
		stu1.setEnNo("it2019");
		stu1.setEmail("axelor@gmail.com");
		stu1.setPassword("123");
		stu1.setName("axelor");
		stu1.setStatus(1);
		stu1.setType(1);

		MoNo mn1 = new MoNo("983475", stu1);
		MoNo mn2 = new MoNo("034875", stu1);
		Set<MoNo> monos = new HashSet<>();
		monos.add(mn1);
		monos.add(mn1);

		Semester sem1 = new Semester("sem1");
		Semester sem2 = new Semester("sem2");
		Set<Semester> sems = new HashSet<>();
		sems.add(sem1);
		sems.add(sem2);

		Leave l1 = new Leave("1/2/2019", "4/2/2019", "no", 1, 1, stu1);
		Leave l2 = new Leave("12/3/2019", "14/3/2019", "no", 1, 1, stu1);
		Set<Leave> leaves = new HashSet<Leave>();
		leaves.add(l1);
		leaves.add(l2);

		stu1.setMoNos(monos);
		stu1.setSemesters(sems);
		stu1.setLeaves(leaves);
		con = new Configuration().configure("com/axelor/xml/hibernate.cfg.xml");

		sf = con.buildSessionFactory();

		ss = sf.openSession();
		// query = ss.createQuery("from User where uid = 5");
		//
		// List<User> user =query.list();
		//
		// for(User u : user) {
		// System.out.println("\n\n"+u.getName());
		// Set<Semester> sem = u.getSemesters();
		// for(Semester s : sem) {
		//
		// System.out.println("\n"+s.getSem());
		// }
		// }
		//
		tr = ss.beginTransaction();

		ss.save(stu1);
		ss.save(sem1);
		ss.save(sem2);
		ss.save(mn1);
		ss.save(mn2);
		ss.save(l1);
		ss.save(l2);

		tr.commit();

	}

}
