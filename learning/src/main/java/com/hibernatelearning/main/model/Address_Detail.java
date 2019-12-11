package com.hibernatelearning.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ADDRESS_DETAIL")
public class Address_Detail extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private Integer id;
	
	@Column(name="FULL_ADDRESS")
	private String full_address;
	
	@Column(name="PINCODE")
	private String pin;
	
	public Address_Detail()
	{
		
	}
	public Address_Detail(Integer id,String full_address,String pin,String status, Date created_date, Date modified_date)
	{
		super(status,created_date,modified_date);
		this.id=id;
		this.full_address=full_address;
		this.pin=pin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFull_address() {
		return full_address;
	}
	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
