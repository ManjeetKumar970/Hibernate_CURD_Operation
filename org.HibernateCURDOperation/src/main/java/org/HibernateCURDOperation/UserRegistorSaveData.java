package org.HibernateCURDOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRegistorSaveData {
	public static void main(String[] args) {
		UserRegistor ur = new UserRegistor();
		ur.setId(2);
		ur.setName("Manjeet");
		ur.setAddresh("Patna pp");
		ur.setState("Bihar");
		ur.setCity("Patna");
		ur.setMobile(9707061);
		ur.setStraem("MCA");
		
		//Configartion 
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ur);
		t.commit();
		
		
		
	}

}
