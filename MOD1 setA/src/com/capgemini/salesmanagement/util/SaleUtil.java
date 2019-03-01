package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;

public class SaleUtil 
{
	private static Map<Integer,Sale> sales= new HashMap<Integer,Sale>();
	public static void setSales(Sale sale) {
		SaleUtil.sales.put(sale.getSaleId(), sale);
	}
	public static HashMap<Integer,Sale> getCollection(){
		return (HashMap<Integer, Sale>) sales;
	}

}
