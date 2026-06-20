package com.labdemo.studentdemo;


import jakarta.persistence.*;


@Entity
@Table(name="Student")
public class Student {
	
	
	@Id
	@Column(name="StudentId")
	
	private int StudentId;
	
	@Column(name="StudentName")
	 private String StudentName;
	
	@Column(name="Course")
	private String Course;
	
	@Column(name="Age")
	private int Age;
	
	public Student()
	{
		
	}
	
	public Student(int StudentId,String StudentName,String Course,int Age)
	{
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.Course=Course;
		this.Age=Age;
	}
		
		public int getStudentId()
		{
			return StudentId;
		}
		
		public void setStudentId(int StudentId)
		{
			this.StudentId=StudentId;
		}
		
		public String getStudentName()
		{
			return StudentName;
		}
		
		public void setStudentName(String StudentName)
		{
			this.StudentName=StudentName;
		}
		
		public String getCourse()
		{
			return Course;
		}
		
		public void setCourse(String Course)
		{
			this.Course=Course;
			
		}
		
		public int getAge()
		{
			return Age;
		}
		
		public void setAge(int Age)
		{
			this.Age=Age;
		}
		
		
		@Override
		public String toString()
		{
			return "Student[StudentId= "+StudentId+
					",StudentName="+StudentName+
					",Course="+Course+
					",Age="+Age+"]";
	}
	

}
