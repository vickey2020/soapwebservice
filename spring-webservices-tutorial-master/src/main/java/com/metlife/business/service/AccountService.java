package com.metlife.business.service;

import com.metlife.common.Account;
import com.metlife.common.Premium;





public interface AccountService {
	

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	public Account getAccountDetails(int accountNumber);
	

}
