package com.metlife.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metlife.business.dao.PremiumDAOInterface;
import com.metlife.business.service.PremiumService;
import com.metlife.common.Premium;

@Service
public class PremiumServiceImpl implements PremiumService{
	@Autowired
	private PremiumDAOInterface premiumDAOInterface;
	
	
	public PremiumDAOInterface getPremiumDAOInterface() {
		return premiumDAOInterface;
	}


	public void setPremiumDAOInterface(PremiumDAOInterface premiumDAOInterface) {
		this.premiumDAOInterface = premiumDAOInterface;
	}


	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */

	public Premium getPremiumDetails(int premiumNumber) {
		Premium premium = premiumDAOInterface.getPremiumDetails(premiumNumber);
		return premium;
	}

}
