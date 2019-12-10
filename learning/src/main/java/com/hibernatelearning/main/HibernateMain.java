package com.hibernatelearning.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernatelearning.dao.BaseDao;
import com.hibernatelearning.dao.EmployeeDao;
import com.hibernatelearning.main.model.Employee;

public class HibernateMain 
{
	static BaseDao dao = new BaseDao();
	static EmployeeDao employeeDao;
	
	public static void main(String... args) throws IOException
	{
		initializeSessionFactory();
		
		startLearningEngine();
	}

	private static void startLearningEngine() throws IOException
	{
		// initializing required objects
		 employeeDao = new EmployeeDao(dao);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = reader.readLine();
		
		while(!s.equals("stop"))
		{
			if(s.equals("saveemployee"))
			{
				Date date=new Date();
				Employee employeeObj1 = new Employee(1, "Raghav", "Software Engineer", 1, 1,"A",date,date);
				
				employeeDao.saveEmployee(employeeObj1);
			}
			
			s = reader.readLine();
		}
		
	}
	private static void initializeSessionFactory()
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factoryObj=config.buildSessionFactory();
		
		dao.setFactory(factoryObj);
	}
}
