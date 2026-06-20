package com.labdemo.employeedemo;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
public class App {
    public static void main(String[] args) {
         
    	Scanner sc=new Scanner(System.in);
    	EmployeeDAO dao = new EmployeeDAO();
    	while(true)
    	{
    		System.out.println("---Employee Demo---");
    		System.out.println("1.Insert Employee");
    		System.out.println("2.Display Employee");
    		System.out.println("3.Update Employee");
    		System.out.println("4.Delete Employee");
    		System.out.println("5.Exit");
    		
    		System.out.println("Enter Your Choice");
    		int ch=sc.nextInt();
    		
    		switch(ch)
    		{
    		case 1: {
    		    Employee e1 = new Employee();

    		    System.out.println("Enter Employee ID");
    		    e1.setEmployeeId(sc.nextInt());
    		    sc.nextLine();

    		    System.out.println("Enter Employee Name");
    		    e1.setEmployeeName(sc.nextLine());

    		    System.out.println("Enter Department");
    		    e1.setDept(sc.nextLine());

    		    System.out.println("Enter Salary");
    		    e1.setSalary(sc.nextInt());
    		    sc.nextLine();

    		    System.out.println("Enter Joining Date (yyyy-mm-dd)");
    		    e1.setJoiningDate(LocalDate.parse(sc.nextLine()));

    		    dao.save(e1);
    		    System.out.println("Employee Saved Successfully");
    		    break;
    		}
    			
    		case 2:
    			List<Employee> employee=dao.findAll();
    			if(employee.isEmpty())
    			{
    				System.out.println("Employees Not Found");
    			}
    			else
    			{
    				for(Employee e:employee)
    				{
    					System.out.println(e);
    				}
    			}
    			
    			break;
    			
    		case 3: {
    		    Employee e1 = new Employee();

    		    System.out.println("Enter Employee ID");
    		    e1.setEmployeeId(sc.nextInt());
    		    sc.nextLine();

    		    System.out.println("Enter Employee Name");
    		    e1.setEmployeeName(sc.nextLine());

    		    System.out.println("Enter Department");
    		    e1.setDept(sc.nextLine());

    		    System.out.println("Enter Salary");
    		    e1.setSalary(sc.nextInt());
    		    sc.nextLine();

    		    System.out.println("Enter Joining Date (yyyy-mm-dd)");
    		    e1.setJoiningDate(LocalDate.parse(sc.nextLine()));

    		    dao.update(e1);
    		    System.out.println("Employee Updated Successfully");
    		    break;
    		}
    			
    		case 4:
    			System.out.println("Enter EmployeeId");
    			int eid=sc.nextInt();
    			dao.delete(eid);
    			break;
    			
    			
    		case 5:
    			System.out.println("Exiting Application");
    			sc.close();
    			System.exit(0);
    			
    			
    		default :
    			System.out.println("Invalid Option");
    			
    		}
    		
    		
    		
    	}
    	 
    	
    	
    	
    }
}
