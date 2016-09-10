package com.metlife.vo;

import javax.xml.bind.annotation.XmlElement;


public class Account {
	
    
    public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	private String accountNumber;
   
    private String accountName;
     
    private Policy policy;

}
