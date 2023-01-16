package Runner;

import Controller.CustomerDAOimpl;
import Daointerface.CustomerDAO;
import model.Customer;

public class AccessCustomer {
	public static void main(String[] args) {

		// Insert
		CustomerDAO customerDao = new CustomerDAOimpl();
		System.out.println("--------- inserting customer records ----------");

		Customer c1 = new Customer();
		c1.setEmail("abc@gmail.com");
		c1.setFname("abc");
		c1.setLname("last1");
		customerDao.addCustomer(c1);

		Customer c2 = new Customer();
		c2.setEmail("def@gmail.com");
		c2.setFname("def");
		c2.setLname("last2");
		customerDao.addCustomer(c2);

		Customer c3 = new Customer();
		c3.setEmail("ghi@gmail.com");
		c3.setFname("ghi");
		c3.setLname("last3");
		customerDao.addCustomer(c3);

		Customer c4 = new Customer();
		c4.setEmail("jkl@gmail.com");
		c4.setFname("jkl");
		c4.setLname("last4");
		customerDao.addCustomer(c4);

		Customer c5 = new Customer();
		c5.setEmail("mno@gmail.com");
		c5.setFname("mno");
		c5.setLname("last5");
		customerDao.addCustomer(c5);

		// Retrieve
		System.out.println(" ====== Display list of all customers ====");
		Customer cc1 = new Customer();
		cc1 = customerDao.getCustomerById(1);
		String email1 = cc1.getEmail();
		String fname1 = cc1.getFname();
		String lname1 = cc1.getLname();
		System.out.println("======================");
		System.out.println(" Email :" + email1 + " First Name: " + fname1 + " Last Name: " + lname1);

		Customer cc2 = new Customer();
		cc2 = customerDao.getCustomerById(2);
		String email2 = cc2.getEmail();
		String fname2 = cc2.getFname();
		String lname2 = cc2.getLname();
		System.out.println("======================");
		System.out.println(" Email :" + email2 + " First Name: " + fname2 + " Last Name: " + lname2);

		Customer cc3 = new Customer();
		cc3 = customerDao.getCustomerById(3);
		String email3 = cc3.getEmail();
		String fname3 = cc3.getFname();
		String lname3 = cc3.getLname();
		System.out.println("======================");
		System.out.println(" Email :" + email3 + " First Name: " + fname3 + " Last Name: " + lname3);

		Customer cc4 = new Customer();
		cc4 = customerDao.getCustomerById(4);
		String email4 = cc4.getEmail();
		String fname4 = cc4.getFname();
		String lname4 = cc4.getLname();
		System.out.println("======================");
		System.out.println(" Email :" + email4 + " First Name: " + fname4 + " Last Name: " + lname4);

		Customer cc5 = new Customer();
		cc5 = customerDao.getCustomerById(5);
		String email5 = cc5.getEmail();
		String fname5 = cc5.getFname();
		String lname5 = cc5.getLname();
		System.out.println("======================");
		System.out.println(" Email :" + email5 + " First Name: " + fname5 + " Last Name: " + lname5);

		// Update
		System.out.println("======================");
		System.out.println("---- Updating customer information -----");

		Customer custupdate = new Customer();
		custupdate.setEmail("xyz@gmail.com");
		custupdate.setFname("xyz");
		custupdate.setLname("Last6");
		boolean u = customerDao.updateCustomerById(custupdate, 3);

		if (u == true) {
			System.out.println("Record is updated");
			System.out.println(" Email :" + custupdate.getEmail() + " First Name: " + custupdate.getFname()
					+ " Last Name: " + custupdate.getLname());
			System.out.println("======================");
		} else {
			System.out.println("Record is not updated");
			System.out.println("======================");
		}

		// Delete
		System.out.println("---- Deleting customer information -----");
		boolean d = customerDao.removeCustomerById(4);
		if (d == true) {
			System.out.println("Record is deleted");
			System.out.println("======================");
		} else {
			System.out.println("Record is not deleted");
			System.out.println("======================");
		}

	}
}
