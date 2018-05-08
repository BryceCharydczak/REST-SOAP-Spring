package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.exception.SoapShopFullException;
import com.revature.model.*;

@WebService
public interface SoapShop {
	
	public List<Soap> getAllSoap();
	public String addSoap(Soap soap) throws SoapShopFullException;
	public String updateSoap(Soap soap);
	public String deleteSoapByFragrance(String fragrance);

}


