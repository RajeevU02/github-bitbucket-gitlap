package com.icf.springbootassignment.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Dependants")
public class Dependants {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="First_Name")
	private String First_Name;
	
	@Column(name="Last_Name")
	private String Last_Name;
	
	@Column(name="Gender")
	private String Gender;
	
	@Column(name="DOB")
	private Date DOB;
	
	@Column(name="Relationship")
	private String Relationship;
	
	public Dependants() {}

	public Dependants(String first_Name, String last_Name, String gender, Date DOB, String relationship) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		Gender = gender;
		this.DOB = DOB;
		Relationship = relationship;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}

	public String getRelationship() {
		return Relationship;
	}

	public void setRelationship(String relationship) {
		Relationship = relationship;
	}

	@Override
	public String toString() {
		return "Dependants [First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Gender=" + Gender + ", DOB="
				+ DOB + ", Relationship=" + Relationship + "]";
	}
}