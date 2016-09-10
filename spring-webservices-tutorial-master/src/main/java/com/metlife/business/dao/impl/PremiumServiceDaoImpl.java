package com.metlife.business.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.metlife.business.dao.PremiumDAOInterface;
import com.metlife.common.Premium;
import com.metlife.persistence.HibernateUtil;

@Repository
public class PremiumServiceDaoImpl implements PremiumDAOInterface{

	public Premium getPremiumDetails(int premiumNumber)
	{
		Premium premium = null;
	     System.out.println("Inside hibernate Dao-Premium");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        
	        session.beginTransaction();
	        //Account account = new Account();
	     List list = new ArrayList();
	       
	        Query query = session.createQuery("from Premium");
	        list =  query.list();
	        
	        System.out.println("# of rows: "+ list.size());
	        for (int i = 0; i < list.size(); i++) {
	        	premium = (Premium) list.get(i);
	         System.out.println(premium);
	        
	        }
	        
	        //session.delete(stock);
	        
	        session.getTransaction().commit();
			return premium;
	}
}
