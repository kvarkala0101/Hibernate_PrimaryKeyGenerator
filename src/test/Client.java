package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BookMovie;

public class Client {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		
		BookMovie booking1 = new BookMovie();
		booking1.setId(1);
		booking1.setMovieName("pk");
		booking1.setSeatNo(33);
		booking1.setShowTime("10:30AM");
		
		int id = (int) session.save(booking1);
		
		System.out.println("data stored in database");
		
		tran.commit();
		
		session.close();
		sf.close();
		
		
		
		
		
		
	}
}
