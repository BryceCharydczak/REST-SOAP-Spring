package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.revature.exception.SoapShopFullException;
import com.revature.model.Soap;

@WebService(endpointInterface="com.revature.service.SoapShop")
public class SoapShopImpl implements SoapShop {

	List<Soap> soapList = new ArrayList<>();
	
	@Override
	public List<Soap> getAllSoap() {
		return soapList;
	}

	@Override
	public String addSoap(Soap soap) throws SoapShopFullException {
		if(soap.getFragrance().equals("Skunk")) {
			throw new SoapShopFullException("We don't want "+ soap);
		}
		for(Soap s : soapList) {
			if(soap.getFragrance().equals(s.getFragrance())){
				return "Didn't add soap fragrance " + soap.getFragrance() + "already exists";
				
			} 
				
			
		}
		soapList.add(soap);
		return "Successfully added soap fragrance " + soap.getFragrance();
		
	}

	@Override
	public String updateSoap(Soap soap) {
		for(Soap s : soapList) {
			if(soap.getFragrance().equals(s.getFragrance())){
				soapList.remove(s);
				soapList.add(soap);
				
			}
		}
		return "Successfully updated soap " + soap.getFragrance();
	}

	@Override
	public String deleteSoapByFragrance(String fragrance) {
		for(Soap s : soapList) {
			if(fragrance.equals(s.getFragrance())){
				soapList.remove(s);
				return "Successfully deleted soap " + fragrance;
			}
		}
		return "Didn't delete soap " + fragrance;
	}

}
