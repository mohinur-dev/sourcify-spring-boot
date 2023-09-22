package com.sourcify.revenue;

import java.sql.Date;

public class RevenueDto {
	int revId, orderId, manuId, retId;
	Date orderDate, delivaryDate;
	double orderAmount, vat, discount, retPay, platformCom, manuEarning;
	String status, retName, ownerName, retPhone, retEmail;
	
	
	public RevenueDto() {
		super();
	}


	public RevenueDto(int revId, int orderId, int manuId, int retId, Date orderDate, Date delivaryDate,
			double orderAmount, double vat, double discount, double retPay, double platformCom, double manuEarning,
			String retName, String ownerName, String retPhone, String retEmail, String status) {
		super();
		this.revId = revId;
		this.orderId = orderId;
		this.manuId = manuId;
		this.retId = retId;
		this.orderDate = orderDate;
		this.delivaryDate = delivaryDate;
		this.orderAmount = orderAmount;
		this.vat = vat;
		this.discount = discount;
		this.retPay = retPay;
		this.platformCom = platformCom;
		this.manuEarning = manuEarning;
		this.status = status;
		this.retName = retName;
		this.ownerName = ownerName;
		this.retPhone = retPhone;
		this.retEmail = retEmail;
		
	}


	public int getRevId() {
		return revId;
	}


	public void setRevId(int revId) {
		this.revId = revId;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getManuId() {
		return manuId;
	}


	public void setManuId(int manuId) {
		this.manuId = manuId;
	}


	public int getRetId() {
		return retId;
	}


	public void setRetId(int retId) {
		this.retId = retId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Date getDelivaryDate() {
		return delivaryDate;
	}


	public void setDelivaryDate(Date delivaryDate) {
		this.delivaryDate = delivaryDate;
	}


	public double getOrderAmount() {
		return orderAmount;
	}


	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}


	public double getVat() {
		return vat;
	}


	public void setVat(double vat) {
		this.vat = vat;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getRetPay() {
		return retPay;
	}


	public void setRetPay(double retPay) {
		this.retPay = retPay;
	}


	public double getPlatformCom() {
		return platformCom;
	}


	public void setPlatformCom(double platformCom) {
		this.platformCom = platformCom;
	}


	public double getManuEarning() {
		return manuEarning;
	}


	public void setManuEarning(double manuEarning) {
		this.manuEarning = manuEarning;
	}


	public String getRetName() {
		return retName;
	}


	public void setRetName(String retName) {
		this.retName = retName;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getRetPhone() {
		return retPhone;
	}


	public void setRetPhone(String retPhone) {
		this.retPhone = retPhone;
	}


	public String getRetEmail() {
		return retEmail;
	}


	public void setRetEmail(String retEmail) {
		this.retEmail = retEmail;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
		
}
