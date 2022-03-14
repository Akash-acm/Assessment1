<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management</h1>
<%
List<String> data=(List<String>)session.getAttribute("data");
for(String s:data){
	out.print(s);
}
	%>

</body>
</html>