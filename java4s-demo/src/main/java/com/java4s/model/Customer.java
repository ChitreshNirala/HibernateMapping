package com.java4s.model;

public class Customer {

	private int custNo;
	private String custName;
	private String Country;
	
	public Customer() {}
	
	
	public Customer(int custNo, String custName, String country) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		Country = country;
	}


	public int getCustNo() {
		return custNo;
	}


	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}
}
