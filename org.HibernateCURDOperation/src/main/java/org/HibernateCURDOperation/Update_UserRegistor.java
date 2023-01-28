package org.HibernateCURDOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update_UserRegistor {
	public static void main(String[] args) {
		UserRegistor ur = new UserRegistor();
		
		ur.setId(1);
		ur.setName("Manjeet123");
		ur.setAddresh("Patna pp");
		ur.setState("Bihar");
		ur.setCity("Patna");
		ur.setMobile(9707061);
		ur.setStraem("MCA");
		
		Configuration cfg = new Configuration().configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		//UserRegistor fth = s.find(UserRegistor.class, 1);
		s.update(ur);
		t.commit();
		
		
	}

}
