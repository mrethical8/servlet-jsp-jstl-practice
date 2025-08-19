 package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	        
	    	//HttpSession session = req.getSession();//using http session
	    	
	    	//session.removeAttribute("k");//once you remove k it will not fetch the value so using this you can remove it //using http session
	    	
	    	//int k = (int)session.getAttribute("k");//you can fetch the value only when you have the value in the session // using http session
	    	
	    	
	    	int k = 0;//using Cookie
	    	Cookie cookies[] = req.getCookies();//using Cookie
	    	
	    	for(Cookie c : cookies)//using cookie
	    	{
	    		if(c.getName().equals("k"))
	    				k = Integer.parseInt(c.getValue());
	    	}
	    	
	    	
	    	
	    	k = k * k;
	    	
	    	PrintWriter out = res.getWriter();
	        out.println("result is " + k);
	        
	        System.out.println("sq called"); 
	    }
	}
