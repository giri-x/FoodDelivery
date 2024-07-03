package com.giri.sbapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.giri.sbapp.model.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {
	@Query("select bid from Bill")
	public List<Integer> getIDList();
	

}
