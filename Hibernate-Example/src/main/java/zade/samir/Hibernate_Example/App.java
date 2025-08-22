package zade.samir.Hibernate_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ){
        
    	Student s1 = new Student(); 
    	
    	s1.setRollNo(1);
    	s1.setsName("Samir");
    	s1.setsAge(23);
    	
    	Configuration cfg = new Configuration();
    	//build the session factory and return the sessionFactory Object
    	SessionFactory sf = cfg.buildSessionFactory();  
    	Session session = sf.openSession(); //open the session for connection
    	
    	session.persist(s1);
    	
    	System.out.println(session);
    }
}
