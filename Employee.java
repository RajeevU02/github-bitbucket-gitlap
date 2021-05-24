package com.icf.springbootassignment.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@Column(name="First_Name")
	private String First_Name;
	
	@Column(name="Last_Name")
	private String Last_Name;
	
	@Column(name="Employment_ID")
	private long Employment_ID;
	
	@Column(name="Start_Date")
	private Date Start_Date;
	
	@Column(name="Designation")
	private String Designation;
	
	@Column(name="Department")
	private String Department;
	
	@Column(name="End_date")
	private Date End_date;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="DOB")
	private Date DOB;
	
	@Column(name="Reporting_Manager")
	private long Reporting_Manager;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="blood_Group")
	private String blood_Group;
	
	@Column(name="address")
	private String address;
	
	public Employee() {}
	
	public Employee(long id, String first_Name, String last_Name, long employment_ID, Date start_Date,
			String designation, String department, Date end_date, String status, Date DOB, long reporting_Manager,
			String gender, String blood_Group, String address) {
		super();
		ID = id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Employment_ID = employment_ID;
		Start_Date = start_Date;
		Designation = designation;
		Department = department;
		End_date = end_date;
		Status = status;
		this.DOB = DOB;
		Reporting_Manager = reporting_Manager;
		this.gender = gender;
		this.blood_Group = blood_Group;
		this.address = address;
	}

	public long getID() {
		return ID;
	}

	public void setID(long id) {
		ID = id;
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

	public long getEmployment_ID() {
		return Employment_ID;
	}

	public void setEmployment_ID(long employment_ID) {
		Employment_ID = employment_ID;
	}

	public Date getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Date getEnd_date() {
		return End_date;
	}

	public void setEnd_date(Date end_date) {
		End_date = end_date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}

	public long getReporting_Manager() {
		return Reporting_Manager;
	}

	public void setReporting_Manager(long reporting_Manager) {
		Reporting_Manager = reporting_Manager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_Group() {
		return blood_Group;
	}

	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Employment_ID="
				+ Employment_ID + ", Start_Date=" + Start_Date + ", Designation=" + Designation + ", Department="
				+ Department + ", End_date=" + End_date + ", Status=" + Status + ", DOB=" + DOB + ", Reporting_Manager="
				+ Reporting_Manager + ", gender=" + gender + ", blood_Group=" + blood_Group + ", address=" + address
				+ "]";
	}
}