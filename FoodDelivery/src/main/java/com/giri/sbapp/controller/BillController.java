package com.giri.sbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giri.sbapp.model.Bill;
import com.giri.sbapp.serviceimpl.BillServiceImpl;

@RestController
@RequestMapping("/bill")
@CrossOrigin("http://localhost:3000")
public class BillController {
	@Autowired
	BillServiceImpl service;

	@PostMapping
	public String insertBill(@RequestBody Bill bill) {
		
		String msg="";
		try {
			service.addBill(bill);
			msg="addSuccess";
			
		}catch(Exception e) {
			
			msg="addFailure";
		}
		return msg;
	}
		
		@GetMapping("{bid}")
		public Bill getBillById (@PathVariable("bid") int id) {
			return service.getBill(id);
		}
		@GetMapping("/all")
		public List<Bill> getBills () {
			return service.getAllBill();
		}
		
		@PutMapping
		public String updateBill(@RequestBody Bill bill) {
			
			String msg="";
			try {
				service.updateBill(bill);
				msg="updateSuccess";
				
			}catch(Exception e) {
				
				msg="updateFailure";
			}
			return msg;
		}
		
		@DeleteMapping("{bid}")
		public String deleteBillById(@PathVariable("bid") int id) {
			String msg="";
			try {
				service.deleteBill(id);
				msg="deleteSuccess";
				
			}catch(Exception e) {
				
				msg="deleteFailure";
			}
			return msg;
			
			
		}
		
		@GetMapping("/idlist")
		public List<Integer> getIDList(){
			return service.getAllId();
		}


}
