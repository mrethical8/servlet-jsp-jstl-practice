<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   

  <sql:setDataSource var = "db" driver="oracle.jdbc.driver.OracleDriver" url="" user="" password=""/>
  
  <sql:query var ="rs" dataSource="${db}">select * from emp </sql:query>
  
  <c:forEach items ="${rs.rows}" var ="emp">
  <br> <c:out value="${emp.empno}"></c:out> : <c:out value="${emp.ename}"></c:out> : <c:out value="${emp.job}"></c:out>
   </c:forEach>
  
</body>
</html>

<%--In summary:
Your error is happening because JSTL SQL tags (<sql:query>, etc.) are not supported or implemented for Tomcat 11 and JSTL 3.0+. You must rewrite your JSP to remove these and use Java code in servlets for database access.

Action:

Remove all SQL taglibs and SQL tags from JSP.

Handle database queries in Java, not in JSP, and display results passed as attributes.--%>