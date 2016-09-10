package com.metlife.common;

import org.hibernate.Session;

import com.metlife.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Account account = new Account();
       //account.setAccountNumber("123");
        account.setAccountName("Kiran kumar");
       
        Policy policy = new Policy();
        
       
        policy.setPolicyName("GENM");
        
        policy.setPolicyCode("4714");
        
        session.save(account);
        session.save(policy);
       
        
        
        //session.delete(stock);
        
        session.getTransaction().commit();
        
        
    }
}
