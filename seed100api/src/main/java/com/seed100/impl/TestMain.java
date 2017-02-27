package com.seed100.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestMain {

	public static void main(String args[]){
		/*try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/seed100","root","Pamp@123"); 
			Statement stmt = con.createStatement();
			boolean insertStatus = stmt.execute("insert INTO seed100member (name, email, phone, whoReferedYou) "
					+ "VALUES (\"xyz\", \"xyz@gmail.com\", 11111, \"ajlfjal\");");
			ResultSet rs = stmt.executeQuery("select * from seed100member");
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
				con.close();
		}
		catch(Exception e)
		{ 
			System.out.println(e); 
		}  */
		
		String host="relay-hosting.secureserver.net";  
		  final String user="mail@seed100.org";//change accordingly  
		  final String password="Binny@29";//change accordingly  
		    
		  String to="binny@seed100.org";//change accordingly  
		  
		   //Get the session object  
		   Properties props = new Properties();  
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		     
		   
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("Meena");  
		     message.setText("Trial");  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
	}
}
