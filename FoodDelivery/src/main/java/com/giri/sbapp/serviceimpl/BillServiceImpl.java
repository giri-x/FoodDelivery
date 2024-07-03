package com.giri.sbapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Bill;
import com.giri.sbapp.repository.BillRepo;
import com.giri.sbapp.service.BillService;

@Service
public class BillServiceImpl implements BillService {
	
    BillRepo repo;
	

	public BillServiceImpl(BillRepo repo) {
		super();
		this.repo = repo;
	}


	@Override
	public void addBill(Bill bill) {
		repo.save(bill);

	}

	@Override
	public Bill getBill(int id) {
		 Optional<Bill> billOptional = repo.findById(id);
		    if (billOptional.isPresent()) {
		        return billOptional.get();
		    } else {
		        return null;
		    }
	}

	@Override
	public List<Bill> getAllBill() {
		return repo.findAll();
	}

	@Override
	public void updateBill(Bill bill) {
		repo.save(bill);

	}

	@Override
	public void deleteBill(int id) {
		repo.deleteById(id);

	}

	@Override
	public List<Integer> getAllId() {
		return repo.getIDList();
	}

}
