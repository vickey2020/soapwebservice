package com.metlife.webController;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.metlife.springWS.App;
import com.metlife.springWS.SoapClientConfig;
import com.metlife.webservice.client.AccountDetailsResponse;
import com.metlife.webservice.client.PolicyTypes;
import com.metlife.webservice.client.PremiumDetailsResponse;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		
		System.out.println("inside hello controller");
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
	        App client = context.getBean(App.class);
	        AccountDetailsResponse response = client.getBeer(1);
	        System.out.println("Beer response: " + response.getAccountDetails().getAccountName());
	       // System.out.println("policy response: " + response.getAccountDetails().getPolices().getPolicyNumber());
		return "Login";

	}

	@RequestMapping(value = "/WelcomePolicy", method = RequestMethod.POST)
	public String printDetails(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		
		System.out.println("inside hello controller print details");
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
	        App client = context.getBean(App.class);
	        AccountDetailsResponse response = client.getBeer(1);
	        System.out.println("Beer response: " + response.getAccountDetails().getAccountName());
	       // System.out.println("policy response: " + response.getAccountDetails().getPolices().getPolicyNumber());
		return "WelcomePolicy";

	}

	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {
		System.out.println("inside hello controller1");
		ModelAndView model = new ModelAndView();
		
		model.setViewName("welcome");
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
	        App client = context.getBean(App.class);
	        AccountDetailsResponse response = client.getBeer(1);
	        System.out.println("Beer response: " + response.getAccountDetails().getAccountName());
	        /*System.out.println("policy response: " + response.getAccountDetails().getPolices().getPolicyNumber());
	        PolicyTypes policyTypes= response.getAccountDetails().getPolices();
*/
		model.addObject("msg", response.getAccountDetails().getAccountName());
		/*model.addObject("policynumber", policyTypes.getPolicyNumber());
	      model.addObject("policyType", policyTypes.getPolicytype());
	      model.addObject("date", policyTypes.getIssuedate());*/
		
		model.addObject("policynumber", "1234");
	      model.addObject("policyType", "LIC");
	      model.addObject("date", "29/08/2016");

		return model;

	}
	
	@RequestMapping(value = "/premium/{name}", method = RequestMethod.GET)
	public ModelAndView premium(@PathVariable("name") String name) {
		System.out.println("inside premium controller1");
		ModelAndView model = new ModelAndView();
		
		model.setViewName("welcome");
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
	        App client = context.getBean(App.class);
	        PremiumDetailsResponse response = client.getBeer2(1);
	        System.out.println("Beer response: " + response.getPremiumDetails().getPremium_no());
	       /* System.out.println("policy response: " + response.getAccountDetails().getPolices().getPolicyNumber());
	        PolicyTypes policyTypes= response.getAccountDetails().getPolices();
*/
		model.addObject("msg", response.getPremiumDetails().getPremium_no());
		/*model.addObject("policynumber", policyTypes.getPolicyNumber());
	      model.addObject("policyType", policyTypes.getPolicytype());
	      model.addObject("date", policyTypes.getIssuedate());
		*/
		model.addObject("premium_no", "1234");
	      model.addObject("start_date", "12/12/2015");
	      model.addObject("premium_paid", "25000");

		return model;

	}

}