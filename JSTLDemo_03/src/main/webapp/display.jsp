<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   
<c:set var = "str" value="Shubham Khandekar is a Java Developer in Mumbai" />
 
 <%-- Length : ${fn: length(str)} --%>
 
 <%-- <c:forEach items="${fn:split(str, ' ')}" var="s">
  <br />
  ${s}
</c:forEach>--%>

<%-- <c:forEach items="${fn:split(str, 'h')}" var="s">
  <br />
  ${s}
</c:forEach> --%>

<%-- index : ${fn:indexOf(str,"is")} --%>

<%-- >is there : ${fn:contains(str,"Java")} --%>

<%-- <c:if test= "${fn:contains(str,'Java')}">
Java is Der
</c:if> --%>

<c:if test= "${fn:endsWith(str,'Mumbai')}">
 you are right buddy
</c:if>
 
  ${fn:toUpperCase(str)} <%--to get suggestion use ${fn:  --%>
  
</body>
</html>
