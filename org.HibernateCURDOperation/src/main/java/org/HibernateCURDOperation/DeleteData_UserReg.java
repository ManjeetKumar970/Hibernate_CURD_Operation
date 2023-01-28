package org.HibernateCURDOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData_UserReg {
	
public static void main(String[] args) {
	
	UserRegistor ur =new UserRegistor();
	ur.setId(1);
	Configuration cgf = new Configuration().configure();
	SessionFactory  sf =cgf.buildSessionFactory();
	Session s =sf.openSession();
	Transaction t = s.beginTransaction();
	s.delete(ur);
	t.commit();
}
}
