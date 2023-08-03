package com.sourcify.admin;

public class AdminSignin {
	String username;
	String password;
	String name;
    String role;
    String email;
	
	

	public AdminSignin(String username, String password, String name, String role, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.email = email;
	}

	public AdminSignin() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	
}
