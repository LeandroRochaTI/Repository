<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chamado</title>
</head>
<body>

	<h1>Lista de chamados para solucionar</h1>

	<table>
		<tr>
			<td>Numero:</td>
			<td>Titulo:</td>
			<td>Descrição:</td>
		</tr>
		<c:forEach items="${chamados}" var ="chamado">
			<tr>
				<td>${chamado.numero}</td>
				<td>${chamado.titulo}</td>
				<td>${chamado.descricao}</td>			
			
			</tr>
		</c:forEach>
	</table>
</body>
</html>
