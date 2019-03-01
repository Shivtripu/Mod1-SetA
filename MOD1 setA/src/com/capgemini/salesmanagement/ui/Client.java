package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		SaleService saleser=new SaleService();
		Sale sale=new Sale();
		while(true)
		{
		try {
		System.out.println("Enter product Code");
		int prodCode=scanner.nextInt();
		if(saleser.ValidateProdCode(prodCode))
		{
			sale.setProdCode(prodCode);
		}
		System.out.println("Enter the Quantity");
		int qty=scanner.nextInt();
		if(saleser.validateQuantity(qty))
		{
			sale.setQuantity(qty);
		}
		System.out.println("Enter Product Category");
		String prodCat=scanner.next();
		if(saleser.validateProdCat(prodCat))
		{
			sale.setCategory(prodCat);
		}
		System.out.println("Enter product name");
		String prodName=scanner.next();
		if(saleser.validateName(prodName))
		{
			sale.setProdName(prodName);
		}
		System.out.println("Enter Product Price");
		float price=scanner.nextFloat();
		if(saleser.validateProdPrice(price))
		{
			sale.setTotal(price*qty);
		}
		System.out.println(saleser.insertSalesDetails(sale).toString());
	    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
}