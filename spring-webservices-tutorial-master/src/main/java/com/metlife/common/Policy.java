package com.metlife.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "policy", catalog = "metlif", uniqueConstraints = {
		@UniqueConstraint(columnNames = "POLICY_NAME"),
		@UniqueConstraint(columnNames = "POLICY_CODE") })
public class Policy implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer policyId;
	private String policyCode;
	private String policyName;
	
	@OneToMany
	@JoinColumn(name="PREMIUM_NO" , insertable = false, updatable = false)
	private Premium premium;
	
	public Premium getPremium() {
		return premium;
	}

	public void setPremium(Premium premium) {
		this.premium = premium;
	}

	@ManyToOne
	@JoinColumn(name="ACCOUNT_NUMBER" , insertable = false, updatable = false)
	private Account account;

	public Policy() {
	}

	public Policy(String policyCode, String policyName) {
		this.policyCode = policyCode;
		this.policyName = policyName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "POLICY_ID", unique = true, nullable = false)
	public Integer getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	@Column(name = "POLICY_CODE", unique = true, nullable = false, length = 10)
	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	@Column(name = "POLICY_NAME", unique = true, nullable = false, length = 20)
	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
