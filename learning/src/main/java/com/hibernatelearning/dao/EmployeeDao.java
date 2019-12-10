package com.hibernatelearning.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernatelearning.main.model.Employee;

public class EmployeeDao
{
	private BaseDao dao;
	
	public EmployeeDao(BaseDao dao) {
		this.dao = dao;
	}

	public void saveEmployee(Employee emp)
	{
		try
		{
			Session session = dao.currentSession();

			Transaction txn = session.beginTransaction();
			session.save(emp);
			txn.commit();
		}
		catch(Exception ex)
		{
			System.out.println("Error occured in saveEmpoyee");
			ex.printStackTrace();
		}
	}
}
