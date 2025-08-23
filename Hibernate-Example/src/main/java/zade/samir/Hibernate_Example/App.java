package zade.samir.Hibernate_Example;

import java.util.Arrays;

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
//
//    	Student updateStudentData = new Student();
//    	
//    	updateStudentData.setRollNo(1);
//    	updateStudentData.setsName("Samir Zade");
//    	updateStudentData.setsAge(23);
//    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Student.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Transaction transaction = session.beginTransaction();
//    	session.merge(updateStudentData); //update and even create the data if not exists
//    	transaction.commit();
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(updateStudentData);

    	
    	
//-----------------Delete the data from database-------------------//
    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Student.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Student updateStudentData = session.find(Student.class, 3);
//    	
//    	Transaction transaction = session.beginTransaction();
//    	
//    	session.remove(updateStudentData);
//    	
//    	transaction.commit();
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(updateStudentData);
    	
//-----------------Embedding(Joining) two databases - Alien & Laptop-------------------//
    	
//    	Laptop laptop = new Laptop();
//    	laptop.setBrand("Asus");
//    	laptop.setModel("ROG");
//    	laptop.setRam(16);
//    	
//    	Alien alien = new Alien(); 
//    	alien.setAid(101);
//    	alien.setAname("Aditya");
//    	alien.setTech("Java");
//    	alien.setLaptop(laptop);
//    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Alien.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Transaction transaction = session.beginTransaction();
//    	
//    	session.persist(alien);
//    	
//    	transaction.commit();
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(alien);
    	
//-----------------OneToOne Mapping-------------------//
    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(1);
//    	laptop.setBrand("Asus");
//    	laptop.setModel("ROG");
//    	laptop.setRam(16);
//    	
//    	Alien alien = new Alien(); 
//    	alien.setAid(110);
//    	alien.setAname("Aditya");
//    	alien.setTech("Java");
//    	alien.setLaptop(laptop);
//    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Alien.class)
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Laptop.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Transaction transaction = session.beginTransaction();
//    	
//    	session.persist(laptop); //primary table, hence above
//    	session.persist(alien); //child table, hence below
//    	
//    	transaction.commit();
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(alien);
    	
    	
    	
    	
//-----------------OneToMany Mapping-------------------//
    	
//    	Laptop laptop1 = new Laptop();
//    	laptop1.setLid(3);
//    	laptop1.setBrand("Asus");
//    	laptop1.setModel("ROG");
//    	laptop1.setRam(16);
//    	
//    	Laptop laptop2 = new Laptop();
//    	laptop2.setLid(2);
//    	laptop2.setBrand("Acer");
//    	laptop2.setModel("Extensa 15");
//    	laptop2.setRam(8);
//    	
//    	Alien alien = new Alien(); 
//    	alien.setAid(111);
//    	alien.setAname("Anurag");
//    	alien.setTech("Python");
//    	alien.setLaptop(Arrays.asList(laptop1, laptop2));
//    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Alien.class)
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Laptop.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Transaction transaction = session.beginTransaction();
//    	
//    	session.persist(laptop1); //primary table, hence above
//    	session.persist(laptop2); //primary table, hence above
//    	session.persist(alien); //child table, hence below
//    	
//    	transaction.commit();
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(alien);
    	
    	
    	
    	
    	
//-----------------OneToOne Mapping-------------------//
    	
//    	Laptop laptop1 = new Laptop();
//    	laptop1.setLid(3);
//    	laptop1.setBrand("Asus");
//    	laptop1.setModel("ROG");
//    	laptop1.setRam(16);
//    	
//    	Laptop laptop2 = new Laptop();
//    	laptop2.setLid(2);
//    	laptop2.setBrand("Acer");
//    	laptop2.setModel("Extensa 15");
//    	laptop2.setRam(8);
//    	
//    	Alien alien = new Alien(); 
//    	alien.setAid(111);
//    	alien.setAname("Anurag");
//    	alien.setTech("Python");
//    	alien.setLaptop(Arrays.asList(laptop1, laptop2));
//    	
//    	laptop1.setAlien(alien);
//    	laptop2.setAlien(alien);
//    	
//    	SessionFactory sf = new Configuration()
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Alien.class)
//		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Laptop.class)
//		    			.configure()
//		    			.buildSessionFactory();    	
//    	
//    	Session session = sf.openSession(); //open the session for connection
//    	
//    	Transaction transaction = session.beginTransaction();
//    	
//    	session.persist(laptop1); //primary table, hence above
//    	session.persist(laptop2); //primary table, hence above
//    	session.persist(alien); //child table, hence below
//    	
//    	transaction.commit();
//    	
//    	session.close(); //close the session
//    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
//    	System.out.println(alien);
    	
//-----------------OneToOne Mapping-------------------//
    	
    	Laptop laptop1 = new Laptop();
    	laptop1.setLid(1);
    	laptop1.setBrand("Asus");
    	laptop1.setModel("ROG");
    	laptop1.setRam(16);
    	
    	Laptop laptop2 = new Laptop();
    	laptop2.setLid(2);
    	laptop2.setBrand("Acer");
    	laptop2.setModel("Extensa 15");
    	laptop2.setRam(8);
    	
    	Laptop laptop3 = new Laptop();
    	laptop3.setLid(3);
    	laptop3.setBrand("Apple");
    	laptop3.setModel("Macbook M4");
    	laptop3.setRam(16);
    	
    	Alien alien1 = new Alien(); 
    	alien1.setAid(111);
    	alien1.setAname("Anurag");
    	alien1.setTech("Python");
    	
    	Alien alien2 = new Alien(); 
    	alien2.setAid(112);
    	alien2.setAname("Aditya");
    	alien2.setTech("Java");
    	
    	Alien alien3 = new Alien(); 
    	alien3.setAid(113);
    	alien3.setAname("Samir");
    	alien3.setTech("C Programming");
    	
    	//adding laptop to aliens
    	alien1.setLaptop(Arrays.asList(laptop1, laptop2));
    	alien2.setLaptop(Arrays.asList(laptop2, laptop3));
    	alien3.setLaptop(Arrays.asList(laptop1, laptop3));
    	
    	//adding the aliens to laptop
    	laptop1.setAliens(Arrays.asList(alien1, alien3));
    	laptop2.setAliens(Arrays.asList(alien1, alien2, alien3));
    	laptop3.setAliens(Arrays.asList(alien2, alien3));
    	
    	SessionFactory sf = new Configuration()
		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Alien.class)
		    			.addAnnotatedClass(zade.samir.Hibernate_Example.Laptop.class)
		    			.configure()
		    			.buildSessionFactory();    	
    	
    	Session session = sf.openSession(); //open the session for connection
    	
    	Transaction transaction = session.beginTransaction();
    	
    	session.persist(laptop1); 
    	session.persist(laptop2); 
    	session.persist(laptop3); 
    	
    	session.persist(alien1); 
    	session.persist(alien2); 
    	session.persist(alien3); 
    	
    	transaction.commit();
    	
    	session.close(); //close the session
    	sf.close(); //close the sessionFactory as it consume lot's of memory and heavy.	
    	System.out.println(alien1);
    }
}
