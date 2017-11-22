<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	if (session.getAttribute("login") == null) {
		response.sendRedirect("setimaquestao.jsp");
	}
	String user = (String) session.getAttribute("login");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Principal</title>
</head>
<body>
	<p>
		Bem vindo:
		<b><%=user%>!!</b>
	</p>
</body>
</html>