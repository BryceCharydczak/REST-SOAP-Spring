package com.revature.main;

import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.revature.model.Soap;
import com.revature.service.SoapShop;

public class Driver {

	public static void main(String[] args) {
		String serviceUrl = "http://soapshop-env.ydthy7jhai.us-east-2.elasticbeanstalk.com/SoapShop";
		//set up our factory to create our service	
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(SoapShop.class);
		factory.setAddress(serviceUrl);
			
		// DEMO
		
		SoapShop soapShop = (SoapShop) factory.create();
		
		// ADDING
		
		Soap vanilla = new Soap("vanilla", "white", 1000);
		Soap cherry = new Soap("cherry", "red", 100);
		Soap mango = new Soap("mango", "orange", 500);
		
		try {
		System.out.println(soapShop.addSoap(vanilla));
		System.out.println(soapShop.addSoap(cherry));
		System.out.println(soapShop.addSoap(mango));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// UPDATING
		Soap updateMango = new Soap("mango", "blue", 50);
		soapShop.updateSoap(updateMango);
		
		
		// DELETING
		try {
		System.out.println(soapShop.deleteSoapByFragrance("cherry"));
		} catch (Exception e) {
			
		}
		
		
//		Soap watermelon = new Soap("watermelon", "red", 5000);
//		try {
//			System.out.println(soapShop.addSoap(watermelon));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(soapShop.deleteSoapByFragrance("Soap"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		// GETTING
		List<Soap> soapList = soapShop.getAllSoap();
		for(Soap b: soapList) {
			System.out.println(b);
		}
////				
		
	}
}
