package com.telusko;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
      //String name = "Shubham";
		
	  //Employee e = new Employee(1,"Shubham");
		
	  	List<Employee> emp = Arrays.asList(new Employee (1,"Shubham"),new Employee (2,"Aarti"),new Employee(3,"Ritika"));
		
		request.setAttribute("Employees",emp);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

} 
  