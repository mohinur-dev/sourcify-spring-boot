package com.sourcify.retailer;

import java.sql.Date;
import java.util.List;

public class Order {

	int oId; 
	Date oDate; 
	int retId; 
	int manuId; 
	double oAmount; 
	double discount;
	double vat; 
	double netPayable; 
	String delDevision; 
	String delDistrict; 
	String delUpozela;
	String delLocation; 
	Date delDate;
	String status;
	double subtotal;
	List<Invoice> orderItems;
	
	public Order() {
		super();
	}

	public Order(int oId, Date oDate, int retId, int manuId, double oAmount, double discount, double vat,
			double netPayable, String delDevision, String delDistrict, String delUpozela, String delLocation,
			Date delDate, String status,double subtotal, List<Invoice> orderItems) {
		super();
		this.oId = oId;
		this.oDate = oDate;
		this.retId = retId;
		this.manuId = manuId;
		this.oAmount = oAmount;
		this.discount = discount;
		this.vat = vat;
		this.netPayable = netPayable;
		this.delDevision = delDevision;
		this.delDistrict = delDistrict;
		this.delUpozela = delUpozela;
		this.delLocation = delLocation;
		this.delDate = delDate;
		this.status = status;
		this.subtotal = subtotal;
		this.orderItems = orderItems;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public Date getoDate() {
		return oDate;
	}

	public void setoDate(Date oDate) {
		this.oDate = oDate;
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

	public double getoAmount() {
		return oAmount;
	}

	public void setoAmount(double oAmount) {
		this.oAmount = oAmount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getNetPayable() {
		return netPayable;
	}

	public void setNetPayable(double netPayable) {
		this.netPayable = netPayable;
	}

	public String getDelDevision() {
		return delDevision;
	}

	public void setDelDevision(String delDevision) {
		this.delDevision = delDevision;
	}

	public String getDelDistrict() {
		return delDistrict;
	}

	public void setDelDistrict(String delDistrict) {
		this.delDistrict = delDistrict;
	}

	public String getDelUpozela() {
		return delUpozela;
	}

	public void setDelUpozela(String delUpozela) {
		this.delUpozela = delUpozela;
	}

	public String getDelLocation() {
		return delLocation;
	}

	public void setDelLocation(String delLocation) {
		this.delLocation = delLocation;
	}

	public Date getDelDate() {
		return delDate;
	}

	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public List<Invoice> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Invoice> orderItems) {
		this.orderItems = orderItems;
	}
	


	
	
}
