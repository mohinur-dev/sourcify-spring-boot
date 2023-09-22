package com.sourcify.revenue;

public class ManufacturerRevenue {
	int manu_id;
	String manuName, email;
	double totalOrderAmount, totalVAT, totalDiscount, totalRetPay, totalPlatformCom, totalManuEarning;
	
	
	public ManufacturerRevenue() {
		super();
	}


	public ManufacturerRevenue(int manu_id, String manuName, String email, double totalOrderAmount, double totalVAT,
			double totalDiscount, double totalRetPay, double totalPlatformCom, double totalManuEarning) {
		super();
		this.manu_id = manu_id;
		this.manuName = manuName;
		this.email = email;
		this.totalOrderAmount = totalOrderAmount;
		this.totalVAT = totalVAT;
		this.totalDiscount = totalDiscount;
		this.totalRetPay = totalRetPay;
		this.totalPlatformCom = totalPlatformCom;
		this.totalManuEarning = totalManuEarning;
	}


	public int getManu_id() {
		return manu_id;
	}


	public void setManu_id(int manu_id) {
		this.manu_id = manu_id;
	}


	public String getManuName() {
		return manuName;
	}


	public void setManuName(String manuName) {
		this.manuName = manuName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getTotalOrderAmount() {
		return totalOrderAmount;
	}


	public void setTotalOrderAmount(double totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}


	public double getTotalVAT() {
		return totalVAT;
	}


	public void setTotalVAT(double totalVAT) {
		this.totalVAT = totalVAT;
	}


	public double getTotalDiscount() {
		return totalDiscount;
	}


	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}


	public double getTotalRetPay() {
		return totalRetPay;
	}


	public void setTotalRetPay(double totalRetPay) {
		this.totalRetPay = totalRetPay;
	}


	public double getTotalPlatformCom() {
		return totalPlatformCom;
	}


	public void setTotalPlatformCom(double totalPlatformCom) {
		this.totalPlatformCom = totalPlatformCom;
	}


	public double getTotalManuEarning() {
		return totalManuEarning;
	}


	public void setTotalManuEarning(double totalManuEarning) {
		this.totalManuEarning = totalManuEarning;
	}
	
	
}
