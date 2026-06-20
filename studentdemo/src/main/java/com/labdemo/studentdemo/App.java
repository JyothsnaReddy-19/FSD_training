package com.labdemo.studentdemo;

import java.util.List;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        StudentDAO dao=new StudentDAO();
        while(true)
        {
        	System.out.println("----Student Demo---");
        	System.out.println("1.Insert Student");
        	System.out.println("2.Display Students");
        	System.out.println("3.Update Student");
        	System.out.println("4.Delete Student");
        	System.out.println("5.Exit");
        	
        	System.out.println("Enter your choice");
        	int ch=sc.nextInt();
        	
        	switch(ch)
        	{
        	case 1:
        	
        	Student s1 = new Student();

            System.out.print("Enter Student Id: ");
            s1.setStudentId(sc.nextInt());

            sc.nextLine();
        	
        	
        	System.out.println("Enter Student Name");
        	s1.setStudentName(sc.nextLine());
        	
        	System.out.println("Enter Course");
        	s1.setCourse(sc.nextLine());
        	
        	System.out.println("Enter Age");
        	s1.setAge(sc.nextInt());
        	
        	dao.save(s1);
        	break;
        	
        	
        	case 2:
        		List<Student> students=dao.findAll();
        		if(students.isEmpty())
        		{
        			System.out.println("No Students Found");
        		}
        		
        		else
        			
        		{
        			for(Student s:students)
        			{
        				System.out.println(s);
        			}
        		}
        		break;
        		
        		
        	case 3:
        		Student s2=new Student();
        		System.out.println("Enter Student Id");
        		s2.setStudentId(sc.nextInt());
        		sc.nextLine();
        		
        		
        		System.out.println("Enter Student Name");
        		s2.setStudentName(sc.nextLine());
        		
        		System.out.println("Enter Course");
        		s2.setCourse(sc.nextLine());
        		
        		System.out.println("Enter Age");
        		s2.setAge(sc.nextInt());
        		
        		dao.update(s2);
        		
        		System.out.println("Students Updated Successfully");
        		break;
        		
        		
        		
        	case 4:
        		System.out.println("Enter Student ID");
        		int sid=sc.nextInt();
        		dao.delete(sid);
        		break;
        		
        	case 5:
        		System.out.println("Exiting Application");
        		sc.close();
        		System.exit(0);
        		
        	default:
        		System.out.println("Invalid Choice");
        	
        	}
        	
        	 
        }
    }
}
