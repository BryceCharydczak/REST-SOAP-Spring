package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.model.Soap;

@WebService
public interface SoapShop {

	public List<Soap> getAllSoap();
	public String addSoap(Soap soap) throws Exception;
	public String updateSoap(Soap soap);
	public String deleteSoapByFragrance(String fragrance);
	
}
