package com.metlife.business.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;











import com.metlife.business.dao.AccountDAOInterface;
import com.metlife.common.Account;
import com.metlife.common.Premium;
import com.metlife.persistence.HibernateUtil;



@Repository
public class AccountServiceDaoImpl implements AccountDAOInterface
{

	/**
	 * Gets the account details.
	 *
	 * @param accountNumber the account number
	 * @return the account details
	 */
	public Account getAccountDetails(int accountNumber)
	{
		Account account = null;
	     System.out.println("Inside hibernate Dao-Account");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        
	        session.beginTransaction();
	        //Account account = new Account();
	     List list = new ArrayList();
	       
	        Query query = session.createQuery("from Account");
	        list =  query.list();
	        
	        System.out.println("# of rows: "+ list.size());
	        for (int i = 0; i < list.size(); i++) {
	          account = (Account) list.get(i);
	         System.out.println(account);
	        
	        }
	        
	        //session.delete(stock);
	        
	        session.getTransaction().commit();
			return account;
	}
	
	}