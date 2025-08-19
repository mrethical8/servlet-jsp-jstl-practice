<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


      <%
      
      response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//byhart kar imp hai
      
      response.setHeader("Pragma","no-cache");//using older version u also need to add this HTTP1.0
      
      response.setHeader("Expires","0");//Proxies
      
     if(session.getAttribute("username")==null)//in new browser session for video or welcome will not direcly open that is point remember
    	 response.sendRedirect("login.jsp");
     
      %>
      <iframe width="560" height="315" src="https://www.youtube.com/embed/4XTsAAHW_Tc?si=lfjTE614oFp6LApF" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>