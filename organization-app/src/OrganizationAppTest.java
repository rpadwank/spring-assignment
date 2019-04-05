package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.service.*;

public class OrganizationAppTest 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

    	Organization orgn = (Organization)context.getBean("organization");
    	/*System.out.println(orgn.getOrgId());
    	System.out.println(orgn.getOrgName());
	System.out.println(orgn.getMarketPrice());
	System.out.println(orgn.getDirectors());
    	System.out.println(orgn.getBranches());
	System.out.println(orgn.getBranchWiseHead());
	System.out.println(orgn.getIpAddresses());*/
	System.out.println(orgn);
	//System.out.println(orgn.getAddress());
    }
}