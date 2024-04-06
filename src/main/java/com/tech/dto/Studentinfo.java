package com.tech.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Studentinfo")
public class Studentinfo {

	@Id
	@GeneratedValue
	@Column
	private int sid;
	
	@Column
	private String city;
	
	@Column
	private int pincode;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Studentinfo [sid=" + sid + ", city=" + city + ", pincode=" + pincode + "]";
	}

	
}
