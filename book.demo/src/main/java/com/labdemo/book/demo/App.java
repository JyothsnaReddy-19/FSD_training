package com.labdemo.book.demo;

import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
         
    	Scanner sc=new Scanner(System.in);
    	BookDAO dao=new BookDAO();
    	
    	while(true)
    	{
    		System.out.println("---BOOK DEMO---");
    		System.out.println("1.Add Book");
    		System.out.println("2.View Book");
    		System.out.println("3.Update Book");
    		System.out.println("4.Remove Book");
    		System.out.println("5.Exit");
    		
    		System.out.println("Enter Your Choice");
    		int ch=sc.nextInt();
    		
    		switch(ch)
    		{
    		case 1:
    			Book b1=new Book();
    			System.out.println("Enter Book Id:");
    			b1.setBookId(sc.nextInt());
    			sc.nextLine();
    			
    			System.out.println("Enter Title");
    			
    		}
    		
    	}
    	
    	
    }
}
