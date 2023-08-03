package com.sourcify.retailer;

public class RetailerSignin {
	 int id;
	 String name;
	 String businessType;
	 String delDivison;
	 String delDistrict;
	 String delUpozela;
	 String delLocation;
	 String ownerName;
	 String username;
	 String email;
	 String phone;
	 String password;
	 String status;
	 String retPicture;
	 
	public RetailerSignin(int id, String name, String businessType, String delDivison, String delDistrict,
			String delUpozela, String delLocation, String ownerName, String username, String email, String phone, String password,
			String status, String retPicture) {
		super();
		this.id = id;
		this.name = name;
		this.businessType = businessType;
		this.delDivison = delDivison;
		this.delDistrict = delDistrict;
		this.delUpozela = delUpozela;
		this.delLocation = delLocation;
		this.ownerName = ownerName;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.status = status;
		this.retPicture = retPicture;
	}

	public RetailerSignin() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDelDivison() {
		return delDivison;
	}

	public void setDelDivison(String delDivison) {
		this.delDivison = delDivison;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRetPicture() {
		return retPicture;
	}

	public void setRetPicture(String retPicture) {
		this.retPicture = retPicture;
	}
	

	
	
}
