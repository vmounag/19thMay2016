package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FourthServlet
 */
@WebServlet("/FourthServlet")
public class FourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FourthServlet() {
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
		
			HttpSession session=request.getSession(false);
			
			String s2=(String) session.getAttribute("firstname");
			out.println("first name is "+s2);
			out.println("<br>");
			String s1=	(String) session.getAttribute("lastname");
			out.println("lastname is "+s1);
			out.println("<br>");
			String s3=(String) session.getAttribute("qualification");
			out.println("qualification is "+s3);
			out.println("<br>");
		
			String m=request.getParameter("mark");
			out.println("marks are "+m);
	}

}
