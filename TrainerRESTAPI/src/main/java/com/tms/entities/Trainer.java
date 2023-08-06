package com.tms.entities;

import jakarta.persistence.Entity;

@Entity
public class Trainer {

	
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Trainer(int id, String name, String address, String phNo) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
	}


	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private int Id;
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhNo() {
		return phNo;
	}


	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}


	private String name;
	private String address;
	private String phNo;
	
}
