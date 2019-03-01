package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDao;
import com.capgemini.salesmanagement.exception.ValidateProdCatException;
import com.capgemini.salesmanagement.exception.ValidateProdCodeException;
import com.capgemini.salesmanagement.exception.ValidateProdNameException;
import com.capgemini.salesmanagement.exception.ValidateProdPriceException;
import com.capgemini.salesmanagement.exception.ValidateProdQtyException;

public class SaleService implements ISaleService 
{
	ISaleDAO isaledao=null;
	public SaleService()
	{
		isaledao=new SaleDao();
	}

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		
		return isaledao.insertSalesDetails(sale);
	}

	@Override
	public boolean ValidateProdCode(int ProdCode) throws ValidateProdCodeException 
	{
		if(ProdCode>=1001 && ProdCode<=1004)
		{
			return true;
		}
		 throw new ValidateProdCodeException("Invalid Product Code");
	}

	@Override
	public boolean validateQuantity(int qty) throws ValidateProdQtyException {
		if(qty>0 && qty<5)
		{
			return true;
		}
		throw new ValidateProdQtyException("Invalid Quantity");
	}

	@Override
	public boolean validateProdCat(String category) throws ValidateProdCatException {
		if(category.equalsIgnoreCase("Electronics")|| category.equalsIgnoreCase("Toys"))
		{
			return true;
		}
		throw new ValidateProdCatException("Invalid Product Category");
	}

	@Override
	public boolean validateName(String prodName) throws ValidateProdNameException {
		if(prodName.equalsIgnoreCase("Tv") || prodName.equalsIgnoreCase("Smart Phone") || prodName.equalsIgnoreCase("Video Game") || prodName.equalsIgnoreCase("Soft Toy") || prodName.equalsIgnoreCase("Telescope") || prodName.equalsIgnoreCase("Barbee Doll"))
		{
			return true;
		}
		throw new ValidateProdNameException("Invalid Product Name");
	}

	@Override
	public boolean validateProdPrice(float price) throws ValidateProdPriceException {
		if(price>200)
		{
			return true;
		}
		throw new ValidateProdPriceException("Invalid Price");
	}

}
