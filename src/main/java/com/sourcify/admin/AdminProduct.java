package com.sourcify.admin;

public class AdminProduct {
	int pId;
	int manuId;
	String manuName;
	String pName; 
	String pGeneric; 
	double uPrice; 
	int pStock; 
	String pPicture;
	String pDescription;
	String pStatus;
	
	public AdminProduct(int pId, int manuId, String manuName, String pName, String pGeneric, double uPrice,
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

	public AdminProduct() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
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
