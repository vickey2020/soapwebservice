package com.metlife.springWS;

/**
 * Hello world!
 *
 */

import com.metlife.webservice.client.AccountDetailsRequest;
import com.metlife.webservice.client.AccountDetailsResponse;
import com.metlife.webservice.client.PremiumDetailsRequest;
import com.metlife.webservice.client.PremiumDetailsResponse;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class App extends WebServiceGatewaySupport {

    public AccountDetailsResponse getBeer(int id) {
        AccountDetailsRequest request = new AccountDetailsRequest();
        request.setAccountNumber("kiRAN11");
        return (AccountDetailsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        
        // AccountDetailsResponse response = new AccountDetailsResponse();
      /*  final SoapActionCallback soapActionCallback = new SoapActionCallback("AccountDetails");
        response = (AccountDetailsResponse) getWebServiceTemplate()
            .marshalSendAndReceive(request, soapActionCallback );*/
         
       
    }
    
    public PremiumDetailsResponse getBeer2(int id) {
        PremiumDetailsRequest request = new PremiumDetailsRequest();
        request.setPremiumNo("123456");
        return (PremiumDetailsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        
        // AccountDetailsResponse response = new AccountDetailsResponse();
      /*  final SoapActionCallback soapActionCallback = new SoapActionCallback("AccountDetails");
        response = (AccountDetailsResponse) getWebServiceTemplate()
            .marshalSendAndReceive(request, soapActionCallback );*/
         
       
    }
    public static void main(String arg[])
    {
    App a= new App();
    a.getBeer(1);
    }
}
