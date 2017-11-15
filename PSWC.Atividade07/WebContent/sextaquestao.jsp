<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*, dao.*, negocio.*, basic.*"%>
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

	<jsp:useBean id="rn" class="negocio.ContatoRN" />
	<table border="0">
		<tr bgcolor=B5B5B5>
			<td><div style="text-align: center;">
					<B>NOME</B>
				</div></td>
			<td><div style="text-align: center;">
					<B>E-MAIL</B>
				</div></td>
			<td><div style="text-align: center;">
					<B>ENDEREÇO</B>
				</div></td>
			<td><div style="text-align: center;">
					<B>NASCIMENTO</B>
				</div></td>

		</tr>
		<c:forEach var="contato" items="${rn.listar()}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? '9AC0CD' : 'D1EEEE' }">
				<td>${contato.nome}</td>
				<td>${contato.email}</td>
				<td>${contato.endereco}</td>
				<td><div style="text-align: center;"><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></div></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>