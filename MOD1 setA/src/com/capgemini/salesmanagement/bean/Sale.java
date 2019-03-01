package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale 
{
	private int saleId;
	private int prodCode;
	private String prodName;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float total;
	
	public Sale() {
		super();
		this.saleId=(int) ((Math.random()*1000)+1);
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getSaleId() {
		return saleId;
	}
	public float getTotal() {
		return total;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", prodCode=" + prodCode + ", prodName=" + prodName + ", category=" + category
				+ ", saleDate=" + saleDate + ", quantity=" + quantity + ", total=" + total + "]";
	}
	

}
