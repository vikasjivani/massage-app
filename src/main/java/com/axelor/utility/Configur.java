package com.axelor.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Configur {
	
	public static SessionFactory createFactory() {
		Configuration con=null;
		con = new Configuration().configure("com/axelor/xml/hibernate.cfg.xml");
		return con.buildSessionFactory();
	}

}
