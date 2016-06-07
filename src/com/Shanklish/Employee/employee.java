package com.Shanklish.Employee;


public class employee 
{
	private static String fName;
	private String lName;
	private String job;
	private int age;
	
	
	public employee()
	{
		fName = "";
		lName = "";
		job = "";
		age = 0;
	}
	
	public employee(String pFname, String pLname, String pJob, int pAge)
	{
		pFname = fName;
		pLname = lName;
		pJob = job;
		pAge = age;
	}
	
	
	
	public void Print(String pname, String pLname, String pJob, int pAge) 
	{
		System.out.println(pname +" " +pLname +" " + pJob +" " + pAge);
			
	}
	

	public String getName()
	{
		return fName;	
	}
	
	public void setName(String NewName)
	{
		NewName = fName;
	}
	
	
	public String getLname()
	{
		return lName;	
	}
	
	public void setLname(String NewLname)
	{
		NewLname = fName;
	}
	
	public int getAge()
	{
		return age;	
	}
	
	public void setAge(int NewAge)
	{
		NewAge = age;
	}
	
	public String getJob()
	{
		return job;	
	}
	
	public void setJob(String NewJob)
	{
		NewJob = job;
	}
}
