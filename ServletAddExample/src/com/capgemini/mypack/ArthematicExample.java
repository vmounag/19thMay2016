package com.capgemini.mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArthematicExample
 */
@WebServlet("/ArthematicExample")
public class ArthematicExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArthematicExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int a=Integer.parseInt(request.getParameter("num1"));
		int b=Integer.parseInt(request.getParameter("num2"));
		
			if(request.getParameter("Calculate").equals("Add"))
			{
				out.println("sum="+(a+b));
				
			}
			else if(request.getParameter("Calculate").equals("subtract"))
			{out.println("Difference="+(a-b));
				
			}
			else if(request.getParameter("Calculate").equals("Multiply"))
			{out.println("Product="+(a*b));
				
			}
			else if(request.getParameter("Calculate").equals("Division"))
			{
				out.println("Division="+(a/b));
				
			}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
