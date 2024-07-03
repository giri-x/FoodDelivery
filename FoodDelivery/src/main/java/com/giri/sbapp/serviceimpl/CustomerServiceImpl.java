package com.giri.sbapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Customer;
import com.giri.sbapp.repository.CustomerRepo;
import com.giri.sbapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepo repo;

	public CustomerServiceImpl(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addCustomer(Customer cst) {
		repo.save(cst);

	}

	@Override
	public Customer getCustomer(int id) {
		   Optional<Customer> customerOptional = repo.findById(id);
		    if (customerOptional.isPresent()) {
		        return customerOptional.get();
		    } else {
		    	return null;
		    }
	}

	@Override
	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	@Override
	public void updateCustomer(Customer cst) {
		repo.save(cst);

	}

	@Override
	public void deleteCustomerId(int id) {
		repo.deleteById(id);

	}

}
