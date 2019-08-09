package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Checkout
 */
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    String companyname;
	public void init(ServletConfig config) throws ServletException {
		ServletContext context=config.getServletContext();
		companyname=(String)context.getInitParameter("Company");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.getWriter().println("Company name: "+companyname);
		response.getWriter().println("<br/>");
		String[] products=request.getParameterValues("Product");
		response.getWriter().println("Products selected\n");
		response.getWriter().println("<br/>");
		if(products==null)
		{
			out.println("No shopping done please select products <a href='ProductPage.html'>Select");
		}
		
		
		else {
			int quantity=0;
		for(String p:products) 
		{
			quantity++;
			response.getWriter().println(p);
			
		}
		
		int total= 10*quantity;
		
		HttpSession session= request.getSession();
		session.setAttribute("Total",total);
		response.getWriter().println("<br/>");
		response.getWriter().println("<a href='PaymentPage'> PAY");
		}
		//RequestDispatcher dispatcher= request.getRequestDispatcher("PaymentPage");
		//dispatcher.forward(request, response);
		
		
			
	}
	

}
