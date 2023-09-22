package com.sourcify.revenue;

import java.sql.Date;

public class RetailerDto {
	int revId, orderId, retId, manuId;
	Date orderDate, delivaryDate;
	double orderAmount, vat, discount, retPay, platformCom, manuEarning;
	String status, manuName, repName, retPhone, retEmail;
	
	public RetailerDto() {
		super();
	}

	public RetailerDto(int revId, int orderId, int retId, int manuId, Date orderDate, Date delivaryDate,
			double orderAmount, double vat, double discount, double retPay, double platformCom, double manuEarning,
			String status, String manuName, String repName, String retPhone, String retEmail) {
		super();
		this.revId = revId;
		this.orderId = orderId;
		this.retId = retId;
		this.manuId = manuId;
		this.orderDate = orderDate;
		this.delivaryDate = delivaryDate;
		this.orderAmount = orderAmount;
		this.vat = vat;
		this.discount = discount;
		this.retPay = retPay;
		this.platformCom = platformCom;
		this.manuEarning = manuEarning;
		this.status = status;
		this.manuName = manuName;
		this.repName = repName;
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

	public int getRetId() {
		return retId;
	}

	public void setRetId(int retId) {
		this.retId = retId;
	}

	public int getManuId() {
		return manuId;
	}

	public void setManuId(int manuId) {
		this.manuId = manuId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManuName() {
		return manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
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
	
	
}
