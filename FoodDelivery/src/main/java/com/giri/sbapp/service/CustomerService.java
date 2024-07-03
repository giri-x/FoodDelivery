package com.giri.sbapp.service;

import java.util.List;

import com.giri.sbapp.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer cst);
	public Customer getCustomer(int id);
	public List<Customer> getAllCustomer();
	public void updateCustomer(Customer cst);
	public void deleteCustomerId(int id);


}
