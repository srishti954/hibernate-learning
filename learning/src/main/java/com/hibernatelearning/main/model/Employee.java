package com.hibernatelearning.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;
//import org.hibernate.annotations.Table;

@Entity
@Table(name= "Employee")
public class Employee {
  
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="EMPLOYEE_ID")
		private Integer id;
		
		@Column(name="EMPLOYEE_NAME")
		private String name;
		
		@Column(name="DESIGNATION")
		private String designation;
		
		@Column(name="ORGANIZATION_ID")
		private Integer org_id;
		
		@Column(name="ADDRESS_ID")
		private Integer adrs_id;
		
		@Column(name="STATUS")
		private String status;
		
		@Column(name="CREATED_DATE")
		private Date created_date;
		
		@Column(name="MODIFIED_DATE")
		private Date modified_date;
		
		public Employee()
		{
			
		}
		public Employee(Integer id,String name,String designation,Integer org_id, Integer adrs_id,String status, Date created_date, Date modified_date)
		{
			this.id=id;
			this.name=name;
			this.designation=designation;
			this.org_id=org_id;
			this.adrs_id=adrs_id;
			this.status=status;
			this.created_date=created_date;
			this.modified_date=modified_date;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Integer getOrg_id() {
			return org_id;
		}
		public void setOrg_id(Integer org_id) {
			this.org_id = org_id;
		}
		public Integer getAdrs_id() {
			return adrs_id;
		}
		public void setAdrs_id(Integer adrs_id) {
			this.adrs_id = adrs_id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Date getCreated_date() {
			return created_date;
		}
		public void setCreated_date(Date created_date) {
			this.created_date = created_date;
		}
		public Date getModified_date() {
			return modified_date;
		}
		public void setModified_date(Date modified_date) {
			this.modified_date = modified_date;
		}
	

}
