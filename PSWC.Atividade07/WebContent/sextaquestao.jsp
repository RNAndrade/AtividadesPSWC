<%@ page import="java.util.*, dao.*, basic.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sexta Questão</title>
</head>
<body>
	<h1>Sexta Questão</h1>
	<hr />
<html>
<body>
	<table>
		<%
			ContatoDAO dao = new ContatoDAO(DAOFactory.getInstance());
			List<Contato> contatos = dao.listar();
			for (Contato contato : contatos) {
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=contato.getDataNascimento().get(Calendar.DATE) + "/"
					+ contato.getDataNascimento().get(Calendar.MONTH) + "/"
					+ contato.getDataNascimento().get(Calendar.YEAR)%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
</body>
</html>