<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    8000<br>
    Shubham<br>
    MANAGER<br>
    
    <br>

<%
String sql = "select * from emp where EMPNO = 8000";  // just added space after select
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
if(rs.next()) {  // added simple check 
%>
    EMPNO : <%= rs.getInt(1) %> <br>
    ENAME : <%= rs.getString(2) %> <br>
    JOB : <%= rs.getString(3) %> <br>
<%
} else {
%>
    No employee found with EMPNO 8000.
<%
}
rs.close();
st.close();
con.close();
%>

</body>
</html>
