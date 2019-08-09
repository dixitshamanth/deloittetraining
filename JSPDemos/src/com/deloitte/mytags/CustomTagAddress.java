package com.deloitte.mytags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {

	public int doStartTag() throws JspException
	{
		JspWriter out=pageContext.getOut();
		try {
		out.println("<h2>Address of Deloitte</h2>");
		out.println("<h2>Divyashree Technopolis, Yemlur</h2>");
		
			out.println("<h2>Bangalore</h2>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return super.doStartTag();
	}
}
