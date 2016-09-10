package com.metlife.springWS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.metlife.webservice.client");
        return marshaller;
    }

    @Bean
    public App weatherClient(Jaxb2Marshaller marshaller) {
        App client = new App();
        client.setDefaultUri("http://localhost:9080/spring-webservices-sample/endpoints/AccountDetailsService.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
    
   /* @Bean
    public App weatherClient2(Jaxb2Marshaller marshaller) {
        App client = new App();
        client.setDefaultUri("http://localhost:9080/spring-webservices-sample/endpoints/PremiumDetailsService.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }*/

}
