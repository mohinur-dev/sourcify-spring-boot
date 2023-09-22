package com.sourcify.reports;

public class InvoiceItems {
	String slNumber;
	String pName;
	String uPrice;
	String pQuantity;
	String pPrice;
	
	public InvoiceItems() {
		super();
	}

	public InvoiceItems(String slNumber, String pName, String uPrice, String pQuantity, String pPrice) {
		super();
		this.slNumber = slNumber;
		this.pName = pName;
		this.uPrice = uPrice;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
	}

	public String getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(String slNumber) {
		this.slNumber = slNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getuPrice() {
		return uPrice;
	}

	public void setuPrice(String uPrice) {
		this.uPrice = uPrice;
	}

	public String getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	

}
