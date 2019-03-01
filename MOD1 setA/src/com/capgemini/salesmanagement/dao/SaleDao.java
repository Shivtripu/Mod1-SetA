package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.SaleUtil;

public class SaleDao implements ISaleDAO 
{
	SaleUtil saleutil=null;
	public SaleDao()
	{
		saleutil=new SaleUtil();
	}

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		// TODO Auto-generated method stub
		SaleUtil.setSales(sale);
		return SaleUtil.getCollection();
	}

}
