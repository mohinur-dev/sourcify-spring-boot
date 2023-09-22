package com.sourcify.retailer;

public class ProductRequest {
	int prId;
	String prName; 
	String prGeneric; 
	int prManuId;
	String prManuName;
	String prManuEmail;
	int prRetId;
	String prRetName;
	String prRetEmail;
	int prQuantity; 
	String prPicture;
	String prStatus;
	
	public ProductRequest() {
		super();
	}

	public ProductRequest(int prId, String prName, String prGeneric, int prManuId, String prManuName, String prManuEmail, int prRetId,
			String prRetName, String prRetEmail, int prQuantity, String prPicture, String prStatus) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.prGeneric = prGeneric;
		this.prManuId = prManuId;
		this.prManuName = prManuName;
		this.prManuEmail = prManuEmail;
		this.prRetId = prRetId;
		this.prRetName = prRetName;
		this.prRetEmail = prRetEmail;
		this.prQuantity = prQuantity;
		this.prPicture = prPicture;
		this.prStatus = prStatus;
	}

	public int getPrId() {
		return prId;
	}

	public void setPrId(int prId) {
		this.prId = prId;
	}

	public String getPrName() {
		return prName;
	}

	public void setPrName(String prName) {
		this.prName = prName;
	}

	public String getPrGeneric() {
		return prGeneric;
	}

	public void setPrGeneric(String prGeneric) {
		this.prGeneric = prGeneric;
	}

	public int getPrManuId() {
		return prManuId;
	}

	public void setPrManuId(int prManuId) {
		this.prManuId = prManuId;
	}

	public String getPrManuName() {
		return prManuName;
	}

	public void setPrManuName(String prManuName) {
		this.prManuName = prManuName;
	}

	public String getPrManuEmail() {
		return prManuEmail;
	}

	public void setPrManuEmail(String prManuEmail) {
		this.prManuEmail = prManuEmail;
	}

	public int getPrRetId() {
		return prRetId;
	}

	public void setPrRetId(int prRetId) {
		this.prRetId = prRetId;
	}

	public String getPrRetName() {
		return prRetName;
	}

	public void setPrRetName(String prRetName) {
		this.prRetName = prRetName;
	}

	public String getPrRetEmail() {
		return prRetEmail;
	}

	public void setPrRetEmail(String prRetEmail) {
		this.prRetEmail = prRetEmail;
	}

	public int getPrQuantity() {
		return prQuantity;
	}

	public void setPrQuantity(int prQuantity) {
		this.prQuantity = prQuantity;
	}

	public String getPrPicture() {
		return prPicture;
	}

	public void setPrPicture(String prPicture) {
		this.prPicture = prPicture;
	}

	public String getPrStatus() {
		return prStatus;
	}

	public void setPrStatus(String prStatus) {
		this.prStatus = prStatus;
	}


	
	
}
