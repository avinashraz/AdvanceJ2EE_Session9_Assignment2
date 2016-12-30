package com.displayheader.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayHeader")
public class DisplayHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "HTTP Header Request Example";
		out.print("<html>"
+"<head>"
+"<title>" +title+" </title>"
+"</head>"
+"<body>"
+"<h1 align= center >"+  title +" </h1>"
+"<table border=1 align=center>"
+"<tr bgcolor=#949494>"
+"<th>Header Name</th><th>Header Value(s)</th>"
+"</tr>");
		Enumeration headerNames = request.getHeaderNames();
	      
	      while(headerNames.hasMoreElements()) {
	         String paramName = (String)headerNames.nextElement();
	         out.print("<tr><td>" + paramName + "</td>");
	         String paramValue = request.getHeader(paramName);
	         out.println("<td> " + paramValue + "</td></tr>");
	      }
			
	      out.println("</table></body></html>");
	   }
		

	

}
