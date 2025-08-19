package com.telusko;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int k = i + j;
             
//        HttpSession session = req.getSession();//using http session
//        session.setAttribute("k", k);//using http session
        
        Cookie cookie = new Cookie("k",k+"");//using Cookie
        res.addCookie(cookie);//using Cookie
        
        res.sendRedirect("sq" );
    }
}
