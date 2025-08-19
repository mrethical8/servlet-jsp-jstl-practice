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
  
     response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//imp hai byhart kar // yeh HTTP 1.1
  
     response.setHeader("Pragma","no-cache");//using older version u also need to add this HTTP1.0
     
     response.setHeader("Expires","0");//Proxies
     
     if(session.getAttribute("username")==null)
    	 response.sendRedirect("login.jsp");
     
  %>

  Welcome ${username}
  
  <a href ="videos.jsp">Videos here</a>
  
  <form action="Logout">
  <input type="submit" value="logout">
  </form>
  
</body>
</html>