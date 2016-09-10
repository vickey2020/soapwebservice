package com.metlife.business.service;

import com.metlife.vo.Account;



public interface AccountService {
	

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	public Account getAccountDetails(int accountNumber);

}
