package com.sourcify.admin;

public class AdminInfo {
    int id;
    String name;
    String role;
    String email;
    String username;
    String picture;
    
	public AdminInfo(int id, String name, String role, String email, String username, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.username = username;
		this.picture = picture;
	}

	public AdminInfo() {
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
    
    
}
