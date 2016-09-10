package com.metlife.business.dao;

import com.metlife.common.Account;







public interface AccountDAOInterface {
	

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	public Account getAccountDetails(int accountNumber);
	

}
