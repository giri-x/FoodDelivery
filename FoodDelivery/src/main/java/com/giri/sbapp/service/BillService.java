package com.giri.sbapp.service;

import java.util.List;

import com.giri.sbapp.model.Bill;

public interface BillService {
	public void addBill(Bill bill);
	public Bill getBill(int id);
	public List<Bill> getAllBill();
	public void updateBill(Bill bill);
	public void deleteBill(int id);
	
	List<Integer> getAllId();

}
