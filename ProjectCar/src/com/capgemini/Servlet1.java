package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Car;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		//Enumeration<Car> car= (Enumeration<Car>) new Car();
	Map<Integer,String> car=new HashMap();
		
	 String carModel=   request.getParameter("carModel");
		
	 String carMake=  	request.getParameter("carMake");
		
	 String carYear=  	request.getParameter("carYear");
		
		car.put(1, carModel);
		car.put(2, carMake);
		car.put(3, carYear);
		
		request.setAttribute("model", carModel);
		request.setAttribute("make", carMake);
		request.setAttribute("year", carYear);
		
		RequestDispatcher rd = request.getRequestDispatcher("Veiw.jsp");
		rd.forward(request, response);
		
		
		
		
		
		
		
		
		
		
	}

}
