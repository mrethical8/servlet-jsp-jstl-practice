package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")

	public class MyServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter out = response.getWriter();
	
	System.out.println("in servlet");
	
	int aid = Integer.parseInt(request.getParameter("aid"));
	String aname = request.getParameter("aname");
	out.println("welcome" + aname);
	
	
			
    }
}
