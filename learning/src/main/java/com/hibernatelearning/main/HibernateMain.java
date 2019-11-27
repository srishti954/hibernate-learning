package com.hibernatelearning.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatelearning.main.model.Employee;

public class HibernateMain 
{
	public static void main(String... args)
	{
		Date date=new Date();
		Employee employeeObj1 = new Employee(1, "Raghav", "Software Engineer", 101, 231,"A",date,date);
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factoryObj=config.buildSessionFactory();
		Session session=factoryObj.openSession();
		
		Transaction txn=session.beginTransaction();
		session.save(employeeObj1);
		txn.commit();
		session.close();
		
		
	}
}
