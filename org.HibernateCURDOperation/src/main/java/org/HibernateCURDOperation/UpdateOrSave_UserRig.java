package org.HibernateCURDOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/// SaveOrUpdate Method use to update date if data not be present in the data base than
//he create colume and save it
public class UpdateOrSave_UserRig {
	public static void main(String[] args) {
		UserRegistor ur = new UserRegistor();
		
		ur.setId(3);
		ur.setName("Manjeet");
		ur.setAddresh("Patna pp");
		ur.setState("Bihar");
		ur.setCity("Patna");
		ur.setMobile(9707061);
		ur.setStraem("MCA");
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf =cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(ur);
		t.commit();
		
	}

}
