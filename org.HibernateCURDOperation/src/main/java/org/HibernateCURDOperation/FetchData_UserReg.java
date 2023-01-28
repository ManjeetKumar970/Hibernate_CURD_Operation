package org.HibernateCURDOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData_UserReg {
	public static void main(String[] args) {
		UserRegistor ur =new UserRegistor();
		Configuration cgf = new Configuration().configure();
		SessionFactory  sf =cgf.buildSessionFactory();
		Session s =sf.openSession();
		UserRegistor feth =s.find(UserRegistor.class, 1);
		if(feth!=null) {
			System.out.println("ID :"+feth.getId());
			System.out.println("NAME : "+feth.getName());
			System.out.println("ID :"+feth.getAddresh());
			System.out.println("NAME : "+feth.getState());
			System.out.println("NAME : "+feth.getCity());
			System.out.println("ID :"+feth.getMobile());
			System.out.println("NAME : "+feth.getStraem());
			
			
		}else
			System.err.println("Data Not Found");
	}

}
