package com.giri.sbapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giri.sbapp.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
