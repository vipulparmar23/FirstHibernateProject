package com.parmar.secondAttempt;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	
    	session.beginTransaction();
    	
    	Employee e1 = new Employee("Vipul", "Parmar");
    	session.save(e1);
    	session.getTransaction().commit();
    	
    }
}
