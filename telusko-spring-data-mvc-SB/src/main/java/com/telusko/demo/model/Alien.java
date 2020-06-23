package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int aId;
	private String name;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", name=" + name + "]";
	}
	
	
	
}
