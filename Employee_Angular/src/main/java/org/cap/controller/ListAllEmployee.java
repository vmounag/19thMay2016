package org.cap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cap.model.Employee;
import org.cap.service.EmployeeService;
import org.cap.service.EmployeeServiceImpl;

import com.google.gson.Gson;


public class ListAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("application/json");
		
		EmployeeService empService=new EmployeeServiceImpl();
		
		
		List<Employee> emps=empService.getAllEmployees();
		
		
		Gson gson=new Gson();
		
		String myJsonEmpObj=gson.toJson(emps);
		
		
		out.println(myJsonEmpObj);
		//System.out.println(emps);
	
	}

}
