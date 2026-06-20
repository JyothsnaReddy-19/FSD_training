package com.labdemo.employeedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 

public class EmployeeDAO {

private SessionFactory sessionFactory;
	
	public EmployeeDAO()
	{
		sessionFactory=Utility.getSessionFactory();
		
	}
	
	private Session getSession()
	{
		return sessionFactory.openSession();
	}
	
	public void save(Employee e)
	{
		Session session= getSession();
		Transaction tx=session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
	}
	
	public List<Employee> findAll()
	{
		Session session =getSession();
		List<Employee> emp=session
				.createQuery("FROM Employee",Employee.class)
				.list();
		session.close();
		return emp;
	}
	
	public void update(Employee e)
	{
		Session session =getSession();
		Transaction tx=session.beginTransaction();
		session.merge(e);
		tx.commit();
		session.close();
	}
	
	public void delete(int id)
	{
		Session session =getSession();
		Transaction tx=session.beginTransaction();
		Employee e=session.find(Employee.class,id);
		if(e!=null)
		{
			session.remove(e);
			System.out.println("Employee Deleted Successfully");
		}
		else
		{
			System.out.println("Employee Not Found");
		}
		tx.commit();
		session.close();
	}

}

