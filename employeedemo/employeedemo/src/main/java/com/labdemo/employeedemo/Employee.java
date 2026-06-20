package com.labdemo.employeedemo;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="EmployeeId")
	private int EmployeeId;
	
	@Column(name="EmployeeName")
	private String EmployeeName;
	
	@Column(name="Dept")
	private String Dept;
	
	@Column(name="Salary")
	private int Salary;
	
	@Column(name="joiningDate")
	private LocalDate joiningDate;
	
	public  Employee()
	{
		
	}
	
	public Employee(int EmployeeId,String EmployeeName,String Dept,int Salary,LocalDate joiningDate)
	{
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		this.Dept=Dept;
		this.Salary=Salary;
		this.joiningDate=joiningDate;
	}
	
	public int getEmployeeId()
	{
		return EmployeeId;
	}
	
	public void setEmployeeId(int EmployeeId)
	{
		this.EmployeeId=EmployeeId;
	}
	
	public String getEmployeeName()
	{
		return EmployeeName;
	}
	
	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName=EmployeeName;
	}
	
	public String getDept()
	{
		return Dept;
	}
	
	public void setDept(String Dept)
	{
		this.Dept=Dept;
	}
	
	public int getSalary()
	{
		return Salary;
	}
	
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	
	public LocalDate getJoiningDate()
	{
		return joiningDate;
	}
	
	public void setJoiningDate(LocalDate joiningDate)
	{
		this.joiningDate=joiningDate;
	}
	
	@Override
	public String toString()
	{
		
		return "Employee[EmployeeId="+EmployeeId+
				",EmployeeName="+EmployeeName+
				",Dept="+Dept+
				",Salary="+Salary+
				",joiningDate="+joiningDate+"]";
	}
	
	
	

}
