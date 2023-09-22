package com.sourcify.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
	JavaMailSender mailer;
	
	public boolean sentEmail(String to, String subject, String body) {
		SimpleMailMessage m = new SimpleMailMessage();
		m.setFrom("sourcify.help@gmail.com");
		m.setTo(to);
		m.setSubject(subject);
		m.setText(body);
		return true;
	}
}
