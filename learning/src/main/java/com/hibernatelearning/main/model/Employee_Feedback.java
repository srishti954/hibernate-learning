package com.hibernatelearning.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "EMPLOYEE_FEEDBACK")
public class Employee_Feedback extends BaseEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FEEDBACK_ID")
	private Integer id;
	
	@Column(name="EMPLOYEE_ID")
	private Integer emp_id;
	
	@Column(name="FEEDBACK_RATING")
	private String feedback_rating;
	
	@Column(name="FEEDBACK_COMMENTS")
	private String feedback_comments;
	
	public Employee_Feedback()
	{
		
	}
	public Employee_Feedback(Integer id,Integer emp_id,String feedback_rating,String feedback_comments,String status, Date created_date, Date modified_date)
	{
		super(status,created_date,modified_date);
		this.id=id;
		this.emp_id=emp_id;
		this.feedback_rating=feedback_rating;
		this.feedback_comments=feedback_comments;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getFeedback_rating() {
		return feedback_rating;
	}
	public void setFeedback_rating(String feedback_rating) {
		this.feedback_rating = feedback_rating;
	}
	public String getFeedback_comments() {
		return feedback_comments;
	}
	public void setFeedback_comments(String feedback_comments) {
		this.feedback_comments = feedback_comments;
	}
	
}
