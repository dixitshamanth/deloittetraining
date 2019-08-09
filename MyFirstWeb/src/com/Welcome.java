package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] color=request.getParameterValues("Color");
		String name=request.getParameter("guestName");
		if(color==null)
			response.getWriter().println("No color provided");
		else {
		counter++;
		response.setContentType("text/html");
		for(String c:color)
		response.getWriter().println("<h1><font color='"+c+"'>Hello "+name+""); 
		response.getWriter().println("<h1>You are visitor number :"+counter);
	}
		
		if(name.contentEquals("Shamanth"))
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("ChainServlet");
			dispatcher.forward(request, response);
		}
		
		else
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("InvalidServlet");
			dispatcher.forward(request, response);
		}
		// TODO Auto-generated method stub
	}
}


