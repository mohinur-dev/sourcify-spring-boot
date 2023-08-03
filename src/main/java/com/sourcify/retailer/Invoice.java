package com.sourcify.retailer;

public class Invoice {

	int iNo; 
	int oId; 
	int manuId;
	int pId;
	String pName;
	double uPrice;
	int pQuantity;
	double price;
	
	public Invoice() {
		super();
	}

	public Invoice(int iNo, int oId, int manuId, int pId, String pName, double uPrice, int pQuantity, double price) {
		super();
		this.iNo = iNo;
		this.oId = oId;
		this.manuId = manuId;
		this.pId = pId;
		this.pName = pName;
		this.uPrice = uPrice;
		this.pQuantity = pQuantity;
		this.price = price;
	}

	public int getiNo() {
		return iNo;
	}

	public void setiNo(int iNo) {
		this.iNo = iNo;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public int getManuId() {
		return manuId;
	}

	public void setManuId(int manuId) {
		this.manuId = manuId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getuPrice() {
		return uPrice;
	}

	public void setuPrice(double uPrice) {
		this.uPrice = uPrice;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
