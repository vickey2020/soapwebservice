package com.metlife.services.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.metlife.business.service.AccountService;
import com.metlife.business.service.PremiumService;
import com.metlife.business.service.premiumservice.PremiumDetailsRequest;
import com.metlife.business.service.premiumservice.PremiumDetailsResponse;
import com.metlife.webservices.Account;
import com.metlife.webservices.Premium;

/**
 * The Class AccountService.
 */
@Endpoint
public class PremiumServiceEndpoint
{
	private static final String TARGET_NAMESPACE = "http://com/metlife/business/service/premiumservice";

	@Autowired
	private PremiumService premiumService;

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	@PayloadRoot(localPart = "PremiumDetailsRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload PremiumDetailsResponse getPremiumDetails(@RequestPayload PremiumDetailsRequest request)
	{
	/*	XMLGregorianCalendar gregFmt = null;
		try {
			gregFmt = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(gregFmt);*/
		PremiumDetailsResponse response = new PremiumDetailsResponse();

		/* call Spring injected service implementation to retrieve account data */
		com.metlife.common.Premium premium = premiumService.getPremiumDetails(1);
		
		Premium newPremium = new Premium();
		newPremium.setPremiumNo(premium.getPremium_no());
		newPremium.setPremiumPaid(premium.getPremium_paid());
		
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
		newPremium.setPolices(policyTypes);*/
		//response.setAccountDetail);
		response.setPremiumDetails(newPremium);	
		
		return response;
	}

	public void setPremiumService(PremiumService premiumService) {
		this.premiumService = premiumService;
	}

}