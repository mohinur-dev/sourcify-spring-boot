package com.sourcify.retailer;

public class Wishlist {
	int wId;
	int pId;
	String pName;
	int retId;
	String retName;
	int manuId;
	String manuName;
	int pQuantity;
	Double uPrice;
	Double price;
	String pPicture;
	
	public Wishlist() {
		super();
	}

	public Wishlist(int wId, int pId, String pName, int retId, String retName, int manuId, String manuName,
			int pQuantity, Double uPrice, Double price, String pPicture) {
		super();
		this.wId = wId;
		this.pId = pId;
		this.pName = pName;
		this.retId = retId;
		this.retName = retName;
		this.manuId = manuId;
		this.manuName = manuName;
		this.pQuantity = pQuantity;
		this.uPrice = uPrice;
		this.price = price;
		this.pPicture = pPicture;
	}

	public int getwId() {
		return wId;
	}

	public void setwId(int wId) {
		this.wId = wId;
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

	public int getRetId() {
		return retId;
	}

	public void setRetId(int retId) {
		this.retId = retId;
	}

	public String getRetName() {
		return retName;
	}

	public void setRetName(String retName) {
		this.retName = retName;
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

	public Double getuPrice() {
		return uPrice;
	}

	public void setuPrice(Double uPrice) {
		this.uPrice = uPrice;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getpPicture() {
		return pPicture;
	}

	public void setpPicture(String pPicture) {
		this.pPicture = pPicture;
	}
	
	

}
