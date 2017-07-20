package customer_details;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer_Operation {
	
	ArrayList<Customer_Attributes> customerArray = new ArrayList<Customer_Attributes>();
	
     public void getUserInput() {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("1.Add Customer \n2.Display Customers \n3. Display particular Customer");    	 
    	 System.out.println("Enter ur option:");
    	 String a=scan.nextLine();
    	 if(!a.isEmpty()){
    		 scan.close();
    		 swithOperation(a);
    	 }
    	 
    	 
     }

	private void swithOperation(String option) {
	
		if(!option.equals("")){
			if(option.equals("1")) {
				getCustomerDetails();
			}else if(option.equals("2")){
				DisplayAllcustomerDetails();
			}else if(option.equals("3")) {
				displayParticularCustomer();		
			}
			else{
			    System.out.println("No option available, please choose right one");
			}
		}
		
		 getUserInput();
	
		 
    }

	private void displayParticularCustomer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Customer id:");
		Customer_Attributes search=new Customer_Attributes();
		    int id = scan.nextInt();		    	   
		    for(Customer_Attributes custolist:customerArray){
		    	 if(custolist.getCustomer_id()==id){
		    		 search=custolist;
		    	 }
		    }
		    
		    
		    if(search.getCustomer_name()==null){
		    	System.out.println("no record found");
		    }else{
		    	 	System.out.println("Company Name:"+search.getCompany());
		 			System.out.println("Customer id:"+search.getCustomer_id());
		 			System.out.println("Customer Name:"+search.getCustomer_name());
		 			System.out.println("Address:"+search.getAddress());
		 			System.out.println("GSTIN:"+search.getCustomer_GSTIN());
		 			System.out.println("email-id:"+search.getCustomer_emailid());
		 			System.out.println("Contact Number:"+search.getCustomer_contactnumber());
		 			System.out.println("City:"+search.getCustomer_city());
		 			System.out.println("State:"+search.getState());
		 			System.out.println("PIN Code:"+search.getPincode());
		    }
		    scan.close();
	}

	private void DisplayAllcustomerDetails() {
		for(Customer_Attributes custolist:customerArray)
		{
			System.out.println("Company Name:"+custolist.getCompany());
			System.out.println("Customer id:"+custolist.getCustomer_id());
			System.out.println("Customer Name:"+custolist.getCustomer_name());
			System.out.println("Address:"+custolist.getAddress());
			System.out.println("GSTIN:"+custolist.getCustomer_GSTIN());
			System.out.println("email-id:"+custolist.getCustomer_emailid());
			System.out.println("Contact Number:"+custolist.getCustomer_contactnumber());
			System.out.println("City:"+custolist.getCustomer_city());
			System.out.println("State:"+custolist.getState());
			System.out.println("PIN Code:"+custolist.getPincode());
		}
	}

	private void getCustomerDetails() {
		Scanner scan = new Scanner(System.in);
		Customer_Attributes newcustomer = new Customer_Attributes();
		System.out.println("Enter Customer Details");
		System.out.println("-----------------------");
		
		System.out.println("Enter the Customer Company");
		newcustomer.setCompany(scan.nextLine());
		System.out.println("Enter the Customer Name:");
		newcustomer.setCustomer_name(scan.nextLine());
		System.out.println("Enter the address:");
		newcustomer.setAddress(scan.nextLine());
		System.out.println("Enter the Customer GSTIN:");
		newcustomer.setCustomer_GSTIN(scan.nextLine());
		System.out.println("Enter the Customer email id:");
		newcustomer.setCustomer_emailid(scan.nextLine());
		System.out.println("Enter the Customer Contact number:");
		newcustomer.setCustomer_contactnumber(scan.nextLine());
		System.out.println("Enter the Customer City:");
		newcustomer.setCustomer_city(scan.nextLine());
		System.out.println("Enter the State:");
	    newcustomer.setState(scan.nextLine());
	    System.out.println("Enter the PIN Code:");
	    newcustomer.setPincode(scan.nextLine());
	    
	    newcustomer.setCustomer_id(customerArray.size()+1);
	    customerArray.add(newcustomer);
	    System.out.println("Customer Details inserted Sucessfully");
	    scan.close();
	    
}
}

