package com.metlife.common;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "premium", catalog = "metlife", uniqueConstraints = {
		@UniqueConstraint(columnNames = "PREMIUM_NO"),
		@UniqueConstraint(columnNames = "PREM_STARTDATE"),
		@UniqueConstraint(columnNames = "PREM_ENDTDATE"),
		@UniqueConstraint(columnNames = "PREMIUM_PAID")})
public class Premium {

	int premium_no;
	Date start_date;
	Date end_date;
	int premium_paid;
	
	@Id
	@GeneratedValue
	@Column(name = "PREMIUM_NO", unique = true, nullable = false)
	public int getPremium_no() {
		return premium_no;
	}
	
	public void setPremium_no(int premium_no) {
		this.premium_no = premium_no;
	}
	
	@Column(name = "PREM_STARTDATE", unique = true, nullable = false, length = 10)
	public Date getStart_date() {
		return start_date;
	}
	
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	@Column(name = "PREM_ENDTDATE", unique = true, nullable = false, length = 10)
	public Date getEnd_date() {
		return end_date;
	}
	
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	@Column(name = "PREMIUM_PAID", unique = true, nullable = false, length = 10)
	public int getPremium_paid() {
		return premium_paid;
	}
	
	public void setPremium_paid(int premium_paid) {
		this.premium_paid = premium_paid;
	}
	
	
}
