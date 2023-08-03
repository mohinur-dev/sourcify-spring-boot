package com.sourcify.retailer;

public class RetailerProduct {
	String pId;
	String manuId;
	String manuName;
	String pName; 
	String pGeneric; 
	double uPrice; 
	int pStock; 
	String pPicture;
	String pDescription;
	String pStatus;
	
	public RetailerProduct(String pId, String manuId, String manuName, String pName, String pGeneric, double uPrice,
			int pStock, String pPicture, String pDescription, String pStatus) {
		super();
		this.pId = pId;
		this.manuId = manuId;
		this.manuName = manuName;
		this.pName = pName;
		this.pGeneric = pGeneric;
		this.uPrice = uPrice;
		this.pStock = pStock;
		this.pPicture = pPicture;
		this.pDescription = pDescription;
		this.pStatus = pStatus;
	}

	public RetailerProduct() {
		super();
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getManuId() {
		return manuId;
	}

	public void setManuId(String manuId) {
		this.manuId = manuId;
	}

	public String getManuName() {
		return manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpGeneric() {
		return pGeneric;
	}

	public void setpGeneric(String pGeneric) {
		this.pGeneric = pGeneric;
	}

	public double getuPrice() {
		return uPrice;
	}

	public void setuPrice(double uPrice) {
		this.uPrice = uPrice;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	public String getpPicture() {
		return pPicture;
	}

	public void setpPicture(String pPicture) {
		this.pPicture = pPicture;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}
	
	
	
}
