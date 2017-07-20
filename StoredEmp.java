package employee;

import java.util.ArrayList;
import java.util.*;


public class StoredEmp {
	
	ArrayList<String> al=new ArrayList<String>();
	
		
			
		
	
	public void getDetails() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your option"); 
		 String option=sc.next();  
		 if(option.equals("add")){
			 System.out.println("Enter your name");  
			  String name=sc.next();  
			   add(name);		
			   getDetails();
		 }
		 else if(option.equals("display")) {
			 			 display();
			 getDetails();
		 }
		 else if(option.equals("delete")){
			 System.out.println("Enter your name you want to delete");  
			  String name=sc.next();  
			  delete(name);
			  getDetails();
		 }
		 else if(option.equals("count")){
			 
			 System.out.println("Number of employee is:");
			 count();
			 
			 getDetails();
		 }
		 
		 else {
			 System.out.println("No Option Available");
			 getDetails();
		 }
		
		   sc.close();          
		
	}
	
	private void add(String emp_name){
		al.add(emp_name);
		System.out.println("Employee Name "+emp_name+" added to List");
	}
	private void display(){
		for (String str: al) {
			System.out.println("Employee Name : " + str);
		}

	}
 private void delete(String name){
	 if(al.contains(name)) {
		 for (int j = 0; j < al.size(); j++) {
			 if(al.get(j).equals(name)){
				 al.remove(j);
			 }		    
			}
	 }
	 else {
		 System.out.println("Name Not Present in List");
	 }
	 
 }
 private void count() {
	

 }

}
