package com.hibernatelearning.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity {
	
		BaseEntity()
		{
			
		}
		BaseEntity(String status, Date created_date, Date modified_date)
		{
			this.status=status;
			this.created_date=created_date;
			this.modified_date=modified_date;
		}
		
		@Column(name="STATUS")
		private String status;
		
		@Temporal(TemporalType.DATE)
		@Column(name="CREATED_DATE")
		private Date created_date;
		
		@Temporal(TemporalType.DATE)
		@Column(name="MODIFIED_DATE")
		private Date modified_date;
		
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
