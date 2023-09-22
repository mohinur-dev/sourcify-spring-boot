package com.sourcify.revenue;

import java.sql.Date;

public class Revenue {
	int revId, orderId, manuId, retId;
	Date orderDate, delivaryDate;
	double orderAmount, vat, discount, retPay, platformCom, manuEarning;
	String status;
	
	public Revenue() {
		super();
	}

	public Revenue(int revId, int orderId, int manuId, int retId, Date orderDate, Date delivaryDate, double orderAmount,
			double vat, double discount, double retPay, double platformCom, double manuEarning, String status) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
