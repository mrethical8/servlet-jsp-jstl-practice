package com.telusko;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code (optional)
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
    	
    	PrintWriter out = response.getWriter();
    	
        // Pre-processing (before target servlet/JSP)
        HttpServletRequest req = (HttpServletRequest) request;
        int aid = Integer.parseInt(request.getParameter("aid"));
        
        if(aid>1)
        // Continue the filter chain
        chain.doFilter(request, response);
        else
        	out.print("Invalid Input");
        	
        // Post-processing (after target servlet/JSP) - optional
    }

    @Override
    public void destroy() {
        // Cleanup code (optional)
    }
}
