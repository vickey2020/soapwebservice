package com.metlife.vo;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

public class Policy {
	
    public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicytype() {
		return policytype;
	}

	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	private String policyNumber;
    
    private String policytype;
    
    private Date issuedate;
}
