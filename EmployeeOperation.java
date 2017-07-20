package test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeOperation {
	
	ArrayList<Employee> emplyeeArray=new ArrayList<Employee>();
	Scanner scan=new Scanner(System.in);
	
	
	public void getUserInput() {
		System.out.println("Enter Your Operation:");
		System.out.println("1.Add new Employee \n2.All Employee Details");
		System.out.println("enter your option");
		String s=scan.next();
		SwitchOperation(s); 
		// String option=scan.nextLine();
		//switch(option)
		//{
		/*//case "1": 
			//this.getEmployeeDetails();
			break;
		case "2":
			this.DisplayAllEmployeeDetails();
			break;
		}*/
		//scan.close();
	}

	private void SwitchOperation(String option) {
		
		//System.out.println(option);
		
	/*
		if(option.equals("1"))
		{
			
		}
		else if(option.equals("2"))
		{
			
		}
		else
		{
			
		}*/
		switch (option) {
		case "1": 
			getEmployeeDetails();
			
			break;
		case "2":
			DisplayAllEmployeeDetails();
			
			break;
		default:
			System.out.println("No option Available ,Please Choose Right one...");
			
			
		}
	}

	private void DisplayAllEmployeeDetails() {
		System.out.println("All "+this.emplyeeArray.size()+" Employee Details are Here...");
		
		for(Employee employee:emplyeeArray) {
			
			System.out.println("******************************Employee Name:"+employee.getEmployee_name()+"****************************"); 
			System.out.println("Employee Id:"+employee.getEmployee_id());
			System.out.println("Emplyee Age:"+employee.getAge());
			System.out.println("Emplyee Designation:"+employee.getDesignation());
			System.out.println("*********************************************************************");
		}
		
		getUserInput();
		
	}

	private void getEmployeeDetails() {
		Employee newemplyee=new Employee();
		System.out.println("Enter Employee Details");
		//Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter employee name:");
		newemplyee.setEmployee_name(scan.next());
		System.out.println("Enter employee Designation:");
		newemplyee.setDesignation(scan.next());
		System.out.println("Enter Age:");
		newemplyee.setAge(scan.nextInt());
		
		
		//scan.close();
		newemplyee.setEmployee_id(emplyeeArray.size()+1);
		
		emplyeeArray.add(newemplyee);
		System.out.println("Employee Registerd successfully...");
		System.out.println("do u want to continue press1 ");
		int a=scan.nextInt();
		if(a==1)
		{
		getUserInput();
		}
		else
		{
			System.out.println("thank you,u have entered wrong option");
		}
	}
	
	
	
}
