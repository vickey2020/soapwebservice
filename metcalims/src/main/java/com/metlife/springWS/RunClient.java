package com.metlife.springWS;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.metlife.webservice.client.AccountDetailsResponse;
import com.metlife.webservice.client.PremiumDetailsResponse;

public class RunClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        App client = context.getBean(App.class);
        AccountDetailsResponse response = client.getBeer(1);
        System.out.println("Account response: " + response.getAccountDetails().getAccountName());
        
        PremiumDetailsResponse response2=client.getBeer2(1);
        System.out.println("Premium response"+ response2.getPremiumDetails().getPremium_no());
      //  System.out.println("policy response: " + response.getAccountDetails().getPolices().getPolicyNumber());
    }

}
