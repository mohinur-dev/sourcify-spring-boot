package com.sourcify.revenue;

public class RetailerRevenue {
	int retId;
	String retName, retEmail;
	double totalOrderAmount, totalVAT, totalDiscount, totalRetPay, totalPlatformCom, totalManuEarning;
	
	
	public RetailerRevenue() {
		super();
	}


	public RetailerRevenue(int retId, String retName, String retEmail, double totalOrderAmount, double totalVAT,
			double totalDiscount, double totalRetPay, double totalPlatformCom, double totalManuEarning) {
		super();
		this.retId = retId;
		this.retName = retName;
		this.retEmail = retEmail;
		this.totalOrderAmount = totalOrderAmount;
		this.totalVAT = totalVAT;
		this.totalDiscount = totalDiscount;
		this.totalRetPay = totalRetPay;
		this.totalPlatformCom = totalPlatformCom;
		this.totalManuEarning = totalManuEarning;
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


	public String getRetEmail() {
		return retEmail;
	}


	public void setRetEmail(String retEmail) {
		this.retEmail = retEmail;
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
