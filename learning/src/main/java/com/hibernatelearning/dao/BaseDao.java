package com.hibernatelearning.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao 
{
	private SessionFactory factory;

	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) 
	{
		this.factory = factory;
	}
	
	public Session currentSession()
	{
		return factory.getCurrentSession();
	}
	
	public Session openSession()
	{
		return factory.openSession();
	}
}
