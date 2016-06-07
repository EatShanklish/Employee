package com.Shanklish.Employee;
import java.util.Scanner;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		
		
		Scanner scan = new Scanner(System.in);
		
		employee employer = new employee();
		
		System.out.println("Please enter the first name");
		String firstName = scan.nextLine();
		employer.setName(firstName);
		
		System.out.println("Please enter the last name");
		String lastName = scan.nextLine();
		employer.setLname(lastName);
		
		System.out.println("Please enter the Job Title");
		String Title = scan.nextLine();
		employer.setJob(Title);
		
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		employer.setAge(age);
		
		scan.close();
		
		employer.Print(firstName, lastName, Title, age);
		
				

	}
	
	
	
	
}