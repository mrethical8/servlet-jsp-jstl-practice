package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
//		  PrintWriter out = response.getWriter();
//		  out.print("hi<br>");
		  
//		  ServletContext ctx = getServletContext();
//		  String str = ctx.getInitParameter("Phone");//name or phone
//		  out.println(str);
		  		
		
		  PrintWriter out = response.getWriter();
		  out.print("hi ");
		  
		  ServletConfig cg = getServletConfig();
		  String str = cg.getInitParameter("name");//name or phone
		  out.println(str);
	}
}
