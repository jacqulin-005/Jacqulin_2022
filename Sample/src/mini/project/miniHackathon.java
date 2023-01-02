package mini.project;

import java.io.*;
import java.util.*;

public class miniHackathon {
	
	public static void main(String[] args) throws FileNotFoundException {

	       try {       
	  String location = "C:/Users/Jacqulin/Desktop/Per Scholas/Java labs/Data/us-500.csv";
	           File file = new File(location);
	           Scanner input = new Scanner(file);
	           ArrayList<Customer> data = new ArrayList<Customer>();

	           while (input.hasNextLine()) {
	               String Line = input.nextLine();
	               String[] cust = Line.split(",");
	               Customer cObj = new Customer();
	               cObj.setFirst_name(cust[0]);
	               cObj.setLast_name( cust[1]);
	               cObj.setCompany_name(cust[2]);

	               data.add(cObj);
	           }
	           input.close();

	           for (Customer c : data) {
	               System.out.println(c.getFirst_name() + " | " + c.getLast_name() + "|" + c.getCompany_name());
	               System.out.println("===============================");
	           }

	       } catch (FileNotFoundException e) {
	           System.out.println("File not found! ");
	           e.printStackTrace();
	       }
	   }

}
	/* public static void main(String[] args) {
    	miniHackathon m = new miniHackathon();
    	m.loadVendorData();     	
    }
	private String[] customer;   
	private String[] temp; 
	private int count = 0;
    void loadVendorData()
    {	
       String file = "C:/Users/Jacqulin/Desktop/Per Scholas/Java labs/Data/us-500.csv";
       String line = ""; 
             
       Scanner sc = new Scanner(System.in);
       System.out.println("Last name of the customer : ");
       String lastname = sc.nextLine();
       
       List<String[]> c1 = new ArrayList<>();
       try 
       (BufferedReader br = new BufferedReader(new FileReader(file))) {
    	   br.readLine();
            while((line = br.readLine()) != null){
                customer = line.split(",");  
            	c1.add(customer);  
            	 if (lastname == customer[1]) {
            		 System.out.println(lastname);
            		 System.out.println(customer[1]);
            		 count ++;
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
               		 /*System.out.println("First Name: " + customer[0] + "\n" + 
             		           "Last Name: " + customer[1] + "\n" + 
             		           "Company: " + customer[2] + "\n" + 
             		           "Address: " + customer[3] + "\n" + 
             		           "City: " + customer[4] + "\n" + 
             		           "County: " + customer[5] + "\n" + 
             		           "State: " + customer[6] + "\n" + 
             		           "Zip: " + customer[7] + "\n" + 
             		           "Phone1: " + customer[8] + "\n" + 
             		           "Phone2: " + customer[9] + "\n" + 
             		           "Email: " + customer[10] + "\n" + 
             		           "Web: " + customer[11]);  
            	}	         	
            }
        } catch (Exception e) {
        	System.out.println(e);
             }  
      if (count > 0) {
   		 System.out.println("First Name: " + temp[0] + "\n" + 
 		           "Last Name: " + temp[1] + "\n" + 
 		           "Company: " + temp[2] + "\n" + 
 		           "Address: " + temp[3] + "\n" + 
 		           "City: " + temp[4] + "\n" + 
 		           "County: " + temp[5] + "\n" + 
 		           "State: " + temp[6] + "\n" + 
 		           "Zip: " + temp[7] + "\n" + 
 		           "Phone1: " + temp[8] + "\n" + 
 		           "Phone2: " + temp[9] + "\n" + 
 		           "Email: " + temp[10] + "\n" + 
 		           "Web: " + temp[11]);  
	}  
  		} 
    }   */

