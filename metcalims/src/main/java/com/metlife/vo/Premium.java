package com.metlife.vo;

import java.util.Date;

public class Premium {
	int premium_no;
	Date start_date;
	Date end_date;
	int premium_paid;
	public Premium() {
	}
	public int getPremium_no() {
		return premium_no;
	}
	public void setPremium_no(int premium_no) {
		this.premium_no = premium_no;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getPremium_paid() {
		return premium_paid;
	}
	public void setPremium_paid(int premium_paid) {
		this.premium_paid = premium_paid;
	}
	
}
