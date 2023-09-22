package com.sourcify.reports;

import java.util.List;

public class Invoice {
	String delDate;
	String ordDate;
	String invNum;
	String ordStatus;
	String manuName;
	String manuId;
	String manuLocation;
	String manuDevision;
	String manuDistrict;
	String manuUpozela;
	String manuRep;
	String manuRepPhone;
	String retId;
	String retName;
	String retLocation;
	String retDevision;
	String retDistrict;
	String retUpozela;
	String retOwnerName;
	String retPhone;
	String subTotal;
	String discount;
	String vat;
	String netPayable;
	List<InvoiceItems> invoiceItems;
	
	public Invoice() {
		super();
	}

	public Invoice(String delDate, String ordDate, String invNum, String ordStatus, String manuName, String manuId,
			String manuLocation, String manuDevision, String manuDistrict, String manuUpozela, String manuRep,
			String manuRepPhone, String retId, String retName, String retLocation, String retDevision,
			String retDistrict, String retUpozela, String retOwnerName, String retPhone, String subTotal,
			String discount, String vat, String netPayable, List<InvoiceItems> invoiceItems) {
		super();
		this.delDate = delDate;
		this.ordDate = ordDate;
		this.invNum = invNum;
		this.ordStatus = ordStatus;
		this.manuName = manuName;
		this.manuId = manuId;
		this.manuLocation = manuLocation;
		this.manuDevision = manuDevision;
		this.manuDistrict = manuDistrict;
		this.manuUpozela = manuUpozela;
		this.manuRep = manuRep;
		this.manuRepPhone = manuRepPhone;
		this.retId = retId;
		this.retName = retName;
		this.retLocation = retLocation;
		this.retDevision = retDevision;
		this.retDistrict = retDistrict;
		this.retUpozela = retUpozela;
		this.retOwnerName = retOwnerName;
		this.retPhone = retPhone;
		this.subTotal = subTotal;
		this.discount = discount;
		this.vat = vat;
		this.netPayable = netPayable;
		this.invoiceItems = invoiceItems;
	}

	public String getDelDate() {
		return delDate;
	}

	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}

	public String getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}

	public String getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getManuName() {
		return manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getManuId() {
		return manuId;
	}

	public void setManuId(String manuId) {
		this.manuId = manuId;
	}

	public String getManuLocation() {
		return manuLocation;
	}

	public void setManuLocation(String manuLocation) {
		this.manuLocation = manuLocation;
	}

	public String getManuDevision() {
		return manuDevision;
	}

	public void setManuDevision(String manuDevision) {
		this.manuDevision = manuDevision;
	}

	public String getManuDistrict() {
		return manuDistrict;
	}

	public void setManuDistrict(String manuDistrict) {
		this.manuDistrict = manuDistrict;
	}

	public String getManuUpozela() {
		return manuUpozela;
	}

	public void setManuUpozela(String manuUpozela) {
		this.manuUpozela = manuUpozela;
	}

	public String getManuRep() {
		return manuRep;
	}

	public void setManuRep(String manuRep) {
		this.manuRep = manuRep;
	}

	public String getManuRepPhone() {
		return manuRepPhone;
	}

	public void setManuRepPhone(String manuRepPhone) {
		this.manuRepPhone = manuRepPhone;
	}

	public String getRetId() {
		return retId;
	}

	public void setRetId(String retId) {
		this.retId = retId;
	}

	public String getRetName() {
		return retName;
	}

	public void setRetName(String retName) {
		this.retName = retName;
	}

	public String getRetLocation() {
		return retLocation;
	}

	public void setRetLocation(String retLocation) {
		this.retLocation = retLocation;
	}

	public String getRetDevision() {
		return retDevision;
	}

	public void setRetDevision(String retDevision) {
		this.retDevision = retDevision;
	}

	public String getRetDistrict() {
		return retDistrict;
	}

	public void setRetDistrict(String retDistrict) {
		this.retDistrict = retDistrict;
	}

	public String getRetUpozela() {
		return retUpozela;
	}

	public void setRetUpozela(String retUpozela) {
		this.retUpozela = retUpozela;
	}

	public String getRetOwnerName() {
		return retOwnerName;
	}

	public void setRetOwnerName(String retOwnerName) {
		this.retOwnerName = retOwnerName;
	}

	public String getRetPhone() {
		return retPhone;
	}

	public void setRetPhone(String retPhone) {
		this.retPhone = retPhone;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getNetPayable() {
		return netPayable;
	}

	public void setNetPayable(String netPayable) {
		this.netPayable = netPayable;
	}

	public List<InvoiceItems> getInvoiceItems() {
		return invoiceItems;
	}

	public void setInvoiceItems(List<InvoiceItems> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}
	
	
}
