package com.metlife.services.endpoints;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.metlife.business.service.AccountService;
import com.metlife.business.service.PremiumService;
import com.metlife.business.service.accountservice.AccountDetailsRequest;
import com.metlife.business.service.accountservice.AccountDetailsResponse;
import com.metlife.common.Policy;
import com.metlife.common.Premium;
import com.metlife.webservices.Account;
import com.metlife.webservices.PolicyTypes;

/**
 * The Class AccountService.
 */
@Endpoint
public class AccountServiceEndpoint
{
	private static final String TARGET_NAMESPACE = "http://com/metlife/business/service/accountservice";

	@Autowired
	private AccountService accountService;
	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	@PayloadRoot(localPart = "AccountDetailsRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload AccountDetailsResponse getAccountDetails(@RequestPayload AccountDetailsRequest request)
	{
	/*	XMLGregorianCalendar gregFmt = null;
		try {
			gregFmt = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(gregFmt);*/
		AccountDetailsResponse response = new AccountDetailsResponse();

		/* call Spring injected service implementation to retrieve account data */
		com.metlife.common.Account account = accountService.getAccountDetails(1);
		
		Account newAccount = new Account();
		newAccount.setAccountNumber(Integer.toString(account.getAccountNumber()));
		newAccount.setAccountName(account.getAccountName());
		
		/*Set<Policy> policySet= account.getPolices();
		Iterator<Policy> ite =policySet.iterator();
		Policy policy = null;
		while(ite.hasNext())
		{
			 policy=	(Policy) ite.next();
		}
		PolicyTypes policyTypes = new PolicyTypes();
		policyTypes.setPolicyNumber(policy.getPolicyCode());
		policyTypes.setPolicytype("LIC");
		//policyTypes.setIssuedate(gregFmt);
		newAccount.setPolices(policyTypes);*/
		//response.setAccountDetail);
		response.setAccountDetails(newAccount);	
		
		return response;
	}


	public void setAccountService(AccountService accountService)
	{
		this.accountService = accountService;
	}
}