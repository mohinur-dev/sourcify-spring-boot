package com.sourcify.email;

public class SimpleEmail {
	String to;
	String subject;
	String body;
		
	public SimpleEmail() {
		super();
	}

	public SimpleEmail(String to, String subject, String body) {
		super();
		this.to = to;
		this.subject = subject;
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
