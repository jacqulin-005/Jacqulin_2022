package Daointerface;

import model.Customer;

public interface CustomerDAO {

	Customer getCustomerById(int id);

	void addCustomer(Customer c);

	boolean updateCustomerById(Customer cust, int id);

	boolean removeCustomerById(int id);

}
