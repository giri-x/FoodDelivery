package com.giri.sbapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int bid;
	
	@Column
	private String food;
	
	@Column
	private int tax;
	
	@Column
	private int total;

	public Bill() {
		super();
		
	}

	public Bill(int bid, int tax, int total) {
		super();
		this.bid = bid;
		this.tax = tax;
		this.total = total;
	}

	public int getBid() {
		return bid;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Bill(int bid, String food, int tax, int total) {
		super();
		this.bid = bid;
		this.food = food;
		this.tax = tax;
		this.total = total;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	

}
