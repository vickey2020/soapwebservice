package com.metlife.business.serviceimpl;

import org.springframework.stereotype.Service;

import com.metlife.business.service.AccountService;
import com.metlife.vo.Account;

@Service
public class AccountServiceImpl implements AccountService
{

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	public Account getAccountDetails(int accountNumber)
	{
		return null;
	}
	}