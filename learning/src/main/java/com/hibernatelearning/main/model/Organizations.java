package com.hibernatelearning.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ORGANIZATIONS")
public class Organizations extends BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORGANIZATION_ID")
	private Integer id;
	
	@Column(name="ORGANIZATION_NAME")
	private String org_name;
	
	@Column(name="ORGANIZATION_DESC")
	private String org_desc;
	
	public Organizations()
	{
		
	}
	public Organizations(Integer id,String org_name,String org_desc,String status, Date created_date, Date modified_date)
	{
		super(status,created_date,modified_date);
		this.id=id;
		this.org_name=org_name;
		this.org_desc=org_desc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_desc() {
		return org_desc;
	}
	public void setOrg_desc(String org_desc) {
		this.org_desc = org_desc;
	}
	
}
