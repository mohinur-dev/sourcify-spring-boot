package com.sourcify.retailer;

public class Cart {
	int cartId;
	int pId;
	String pName;
	int manuId;
	String manuName;
	int pQuantity;
	double uPrice;
	double price;
	String pPicture;
	int retId;
	
	public Cart(int cartId, int pId, String pName, int manuId, String manuName, int pQuantity, double uPrice,
			double price, String pPicture, int retId) {
		super();
		this.cartId = cartId;
		this.pId = pId;
		this.pName = pName;
		this.manuId = manuId;
		this.manuName = manuName;
		this.pQuantity = pQuantity;
		this.uPrice = uPrice;
		this.price = price;
		this.pPicture = pPicture;
		this.retId = retId;
	}
	
	public Cart() {
		super();
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
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
	public int getManuId() {
		return manuId;
	}
	public void setManuId(int manuId) {
		this.manuId = manuId;
	}
	public String getManuName() {
		return manuName;
	}
	public void setManuName(String manuName) {
		this.manuName = manuName;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public double getuPrice() {
		return uPrice;
	}
	public void setuPrice(double uPrice) {
		this.uPrice = uPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getpPicture() {
		return pPicture;
	}
	public void setpPicture(String pPicture) {
		this.pPicture = pPicture;
	}
	public int getRetId() {
		return retId;
	}
	public void setRetId(int retId) {
		this.retId = retId;
	}
		
	
}

