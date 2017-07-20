package employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String n="";
		do{
			try{
		StoredEmp emp = new StoredEmp();
		emp.getDetails();
		System.out.println("do u wanna cont type 1 for cont");
		 n=sc.next();
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
		}
		while(n=="y");
	}

}
