package com.metlife.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metlife.business.dao.AccountDAOInterface;
import com.metlife.business.service.AccountService;
import com.metlife.common.Account;
import com.metlife.common.Premium;


@Service
public class AccountServiceImpl implements AccountService
{

	@Autowired
	private AccountDAOInterface accountDAOInterface;
	
	public AccountDAOInterface getAccountDAOInterface() {
		return accountDAOInterface;
	}

	public void setAccountDAOInterface(AccountDAOInterface accountDAOInterface) {
		this.accountDAOInterface = accountDAOInterface;
	}

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	public Account getAccountDetails(int accountNumber)
	{
		Account account =	accountDAOInterface.getAccountDetails(accountNumber);
		return account;
	}

	}