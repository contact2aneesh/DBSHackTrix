package com.dbshacktrix.loan.service;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	
	public void sendmail(String status) {
		   Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication("table10.dbshacktricks@gmail.com", "aneesh54321");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   try {
			msg.setFrom(new InternetAddress("table10.dbshacktricks@gmail.com", false));

			   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("contact2aneesh@gmail.com"));
			   msg.setSubject("Loan status changed to " + status);
			   msg.setContent("Status changed for your loan request to " + status, "text/html");
			   msg.setSentDate(new Date());
			   
			   Transport.send(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		}
}
