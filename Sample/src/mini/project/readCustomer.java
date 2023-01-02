package mini.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readCustomer {
	public  ArrayList<Customer> customerdetails() {
		//ArrayList<Customer> list = new ArrayList<Customer>();
			
		String file = "C:/Users/Jacqulin/Desktop/Per Scholas/Java labs/Data/us-500.csv";
	    String line = ""; 
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Last name of the customer : ");
	    String lastname = sc.nextLine();
	       
	    ArrayList<Customer> cust = new ArrayList<Customer>();
	    List<String[]> list = new ArrayList<>();
	    String[] customer;   
		String[] temp = null; 
	
	    
	    try 
	       (BufferedReader br = new BufferedReader(new FileReader(file))) {
	    	   br.readLine();
	    	   
	            while((line = br.readLine()) != null){
	                customer = line.split(",");  
	            	list.add(customer);  
	            	 if (lastname == customer[1]) {
	            		 System.out.println(lastname);
	            		 System.out.println(customer[1]);
	            		 //count ++;
	            		 temp[0] = customer[0];
	            		 temp[1] = customer[1];
	            		 temp[2] = customer[2];
	            		 temp[3] = customer[3];
	            		 temp[4] = customer[4];
	            		 temp[5] = customer[5];
	            		 temp[6] = customer[6];
	            		 temp[7] = customer[7];
	            		 temp[8] = customer[8];
	            		 temp[9] = customer[9];
	            		 temp[10] = customer[10];
	            		 temp[11] = customer[11];
	               		 
	            	}	         	
	            }
	        } catch (Exception e) {
	        	System.out.println(e);
	             } 
	    sc.close();
		return cust;
	}
}
