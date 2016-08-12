package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try{
		int empid=Integer.parseInt(request.getParameter("empID"));
		
		String s=request.getParameter("empname");
		
		  
		    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		   Date strDate= formatter.parse(request.getParameter("Jdate"));  
		java.sql.Date sqlDate=new java.sql.Date(strDate.getTime());
		
				Class.forName("com.mysql.jdbc.Driver");
			
		 
			java.sql.Connection   con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mouna","root","password");
		
		 
		Statement stmt=(Statement) con.createStatement();
		
		int i=stmt.executeUpdate("insert into employee values('"+empid+"','"+s+"','"+sqlDate+"')");
		
		 
		if(i==1)
			response.sendRedirect("MessagePage.jsp");
		    

	}catch(IOException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
