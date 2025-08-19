<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   <%-- ${label} <br> --%>  <%--jsp k aabhi k verion mein use krte hai --%>
   
   <%--thats how we use out tag in jsp--%>
   <%-- <c:out value="${label}" />--%>   <%--jsp k purane verion mein use krte the --%>
   
   <%--<c:import url="https://www.telusko.com/"></c:import>--%>
   
  <%-- ${Employee.ename} --%>
  
  <%--   ${Employees} --%>
  
  <c:forEach items= "${Employees}" var = "e">
  <%--${e}<br/> --%>
  ${e.ename}<br/>
  </c:forEach>
   
  
    
   
  
</body>
</html>