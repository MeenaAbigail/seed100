package com.seed100.impl;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/member")
public class Seed100Service extends HttpServlet {
String result;
	/*@GET
	@Path("/makedonations/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}*/
	
/*	@POST
	@Path("/membership/registration")
	@Consumes("application/json")
	public Response printMessage(User user) {
		
		//Save
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/seed100","root","Pamp@123"); 
			if(connection != null){
				Statement stmt = connection.createStatement();
				boolean insertStatus = stmt.execute("insert INTO seed100member (name, email, phone, whoReferedYou) "
						+ "VALUES (" + user.toString() + ");");
				
				ResultSet rs = stmt.executeQuery("select * from seed100member");
				while(rs.next())  
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
					connection.close();
			}
		}
		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		catch(Exception e)
		{ 
			System.out.println(e); 
		}  
		
		String result = "Dear " + user.getName() + ".. Thanks for the registration.";
		return Response.status(200).entity(result).build();

	}*/
	
	
	@POST
	@Path("/registration")
	public Response addUser(
			@FormParam("name") String name,
			@FormParam("email") String email,
			@FormParam("phone") int phone,
			@FormParam("whoReferedYou") String whoReferedYou) throws URISyntaxException{

		//Save
		/*String name=request.getParameter("name");	
		String email=request.getParameter("email");	
		String phone=request.getParameter("phone");	
		String whoReferedYou=request.getParameter("whoReferedYou");	
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(whoReferedYou);*/
		
		try
				{  
					Class.forName("com.mysql.jdbc.Driver");  
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/seed100","root","Pamp@123"); 
					if(connection != null){
						Statement stmt = connection.createStatement();
						boolean insertStatus = stmt.execute("insert INTO seed100member (name, email, phone, whoReferedYou) "
								+ "VALUES (" + "\"" + name + "\",\"" + email + "\","
								+ phone + ",\"" + whoReferedYou + "\"" + ");");
						
						ResultSet rs = stmt.executeQuery("select * from seed100member");
						while(rs.next())  
							System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
							connection.close();
					}
					
			           
				}
				catch (SQLException e) {
					System.out.println("Connection Failed! Check output console");
					e.printStackTrace();
					java.net.URI location1 = new java.net.URI("http://localhost:8080/seed100api/failure.jsp");
					return Response.temporaryRedirect(location1).build();
				}
				catch(Exception e)
				{ 
					System.out.println(e); 
				}
		
				
				//Email
		
				
				 result = "Dear " + name + ".. Thanks for the registration.";
				//return Response.status(200).entity(result).build();  
				 java.net.URI location = new java.net.URI("http://localhost:8080/seed100api/success.jsp");
				 return Response.temporaryRedirect(location).build();
				/* HttpSession session=request.getSession(); 
					session.setAttribute("Result", result);
					System.out.println("Result"+result);*/
			
				//JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
				
				
				
	}
	@POST
	@Path("/contactus")
	public Response contact( 
		@FormParam("name") String name,
		@FormParam("email") String email,
		@FormParam("subject") String subject,
		@FormParam("message") String message) throws URISyntaxException{

		java.net.URI location = new java.net.URI("http://localhost:8080/seed100api/succes.jsp");
		
		//Save
				try
				{  
					Class.forName("com.mysql.jdbc.Driver");  
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/seed100","root","Pamp@123"); 
					if(connection != null){
						Statement stmt = connection.createStatement();
						String insertStmt = "insert INTO contactus (name, email, subject, message) "
								+ "VALUES (" + "\"" + name + "\",\"" + email + "\",\""
								+ subject + "\",\"" + message + "\"" + ");";
						System.out.println(insertStmt);
						boolean insertStatus = stmt.execute(insertStmt);
						
						ResultSet rs = stmt.executeQuery("select * from contactus");
						while(rs.next())  
							System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
							connection.close();
					}
					
			           
				}
				catch (SQLException e) {
					System.out.println("Connection Failed! Check output console");
					e.printStackTrace();
					java.net.URI location1 = new java.net.URI("http://localhost:8080/seed100api/failure.jsp");
					return Response.temporaryRedirect(location1).build();
				}
				catch(Exception e)
				{ 
					System.out.println(e); 
				}  
				
				//Email
		
				
				 result = "Dear " + name + ".. Thanks for writing to us! We wil get back to you soon";
				//return Response.status(200).entity(result).build();
				 
				 return Response.temporaryRedirect(location).build();
				
			
				//JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
				
				
				
	}
	
}
