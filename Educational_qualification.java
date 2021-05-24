package com.icf.springbootassignment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Educational_qualification")
public class Educational_qualification {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Type")
	private String Type;

	@Column(name = "Start_Date")
	private Date Start_Date;

	@Column(name = "End_date")
	private Date End_date;

	@Column(name = "Institution")
	private String Institution;

	@Column(name = "address")
	private String address;

	@Column(name = "Percentage")
	private long Percentage;

	public Educational_qualification(String type, Date start_Date, Date end_date, String institution, String address,
			long percentage) {
		super();
		Type = type;
		Start_Date = start_Date;
		End_date = end_date;
		Institution = institution;
		this.address = address;
		Percentage = percentage;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Date getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}

	public Date getEnd_date() {
		return End_date;
	}

	public void setEnd_date(Date end_date) {
		End_date = end_date;
	}

	public String getInstitution() {
		return Institution;
	}

	public void setInstitution(String institution) {
		Institution = institution;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPercentage() {
		return Percentage;
	}

	public void setPercentage(long percentage) {
		Percentage = percentage;
	}

	@Override
	public String toString() {
		return "Educational_qualification [Type=" + Type + ", Start_Date=" + Start_Date + ", End_date=" + End_date
				+ ", Institution=" + Institution + ", address=" + address + ", Percentage=" + Percentage + "]";
	}
}