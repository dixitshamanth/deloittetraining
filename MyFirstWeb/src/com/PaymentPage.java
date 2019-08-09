package com;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentPage
 */
public class PaymentPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentPage() {
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
		response.getWriter().println("Company name: "+companyname);
		response.getWriter().println("<br/>");

		HttpSession session=request.getSession();
		String gn=(String) session.getAttribute("Name");
		int total=(int)session.getAttribute("Total");
		
		response.getWriter().println(" Hello "+gn+", Your Total Bill for final payment is "+total);
	}

}
