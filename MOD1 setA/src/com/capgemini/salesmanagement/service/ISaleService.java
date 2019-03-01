package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.ValidateProdCatException;
import com.capgemini.salesmanagement.exception.ValidateProdCodeException;
import com.capgemini.salesmanagement.exception.ValidateProdNameException;
import com.capgemini.salesmanagement.exception.ValidateProdPriceException;
import com.capgemini.salesmanagement.exception.ValidateProdQtyException;

public interface ISaleService 
{
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale);
	public boolean ValidateProdCode(int PordCode) throws ValidateProdCodeException;
	public boolean validateQuantity(int qty) throws ValidateProdQtyException;
	public boolean validateProdCat(String category) throws ValidateProdCatException;
	public boolean validateName(String prodName) throws ValidateProdNameException;
	public boolean validateProdPrice(float price) throws ValidateProdPriceException;

}
