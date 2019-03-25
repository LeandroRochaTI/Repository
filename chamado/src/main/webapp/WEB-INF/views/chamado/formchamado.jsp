<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>chamados</title>
</head>
<body>

<%@ include file="/WEB-INF/views/cabecalho.jsp" %>

<form action="/chamado/meuschamados" method="POST">
	<div>
		<label>Titulo</label>
		<input type="text" name="titulo"/>
	</div>

	<div>
		<label> Descrição </label>
		<textarea rows="30" cols="80" name="descricao"></textarea>
	</div>
	
	<div>
		<button type="submit">Cadastrar</button>
	</div>
</form>

</body>
</html>