package zade.samir.Hibernate_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ){
        
//-----------------Add the data to database-------------------//    	
    	
//    	Student s1 = new Student(); 
    	
//    	s1.setRollNo(3);
//    	s1.setsName("Shwetu");
//    	s1.setsAge(15);
    	
//    	Configuration cfg = new Configuration();
//    	cfg.addAnnotatedClass(zade.samir.Hibernate_Example.Student.class);
//    	cfg.configure();
//    	
//    	//build the session factory and return the sessionFactory Object
//    	SessionFactory sf = cfg.buildSessionFactory();  
    	
//    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Student.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Transaction transaction = session.beginTransaction(); //begin database changes or begin transactions
//    	session.persist(s1); //save the data (persist means save)
//    	transaction.commit(); //end the transaction or save the changes
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.
//    
    	
//-----------------Get the data from database-------------------//

//    	Student getStudentData = null;
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Student.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	getStudentData = session.find(Student.class, 3); //get the student data
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(getStudentData);
    	
//-----------------Update the data to database-------------------//

    	Student updateStudentData = new Student();
    	
    	updateStudentData.setRollNo(1);
    	updateStudentData.setsName("Samir Zade");
    	updateStudentData.setsAge(23);
    	
    	SessionFactory sf = new Configuration()
		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Student.class)
		    			.configure()
		    			.buildSessionFactory();    	
    	
    	Session session = sf.openSession(); //open the session for connection
    	
    	Transaction transaction = session.beginTransaction();
    	session.merge(updateStudentData); //update and even create the data if not exists
    	transaction.commit();
    	
    	session.close(); //close the session
    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
    	System.out.println(updateStudentData);
    }
}
