package com.metlife.common;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "account", catalog = "metlife", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ACCOUNT_NUMBER") })
public class Account implements java.io.Serializable{
   
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountNumber;
	private String accountName;
  
   
  
    
    private Set<Policy> polices = new HashSet<Policy>(
			0);

    @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ACCOUNT_NUMBER",  nullable = false)
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Column(name = "ACCOUNT_NAME",  nullable = false, length = 10)
	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Policy> getPolices() {
		return polices;
	}


	public void setPolices(Set<Policy> polices) {
		this.polices = polices;
	}

	
}
