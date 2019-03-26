<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="resources/css/bootstrap.min.css" >
	
		<!-- Optional theme -->
		<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
		
		<link rel="stylesheet" href="resources/css/menus.css">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="resources/js/bootstrap.min.js"></script>
	
		<meta charset="UTF-8">
		<title>Chamado</title>
	</head>
	
	
	<body>
		<%@ include file="/WEB-INF/views/cabecalho.jsp" %>
			    
		<!-- <div class="container-fluid">
			 -->	   
			<div class="row">
			      
				<div class="col-sm-3 col-md-2 sidebar">
					<ul class="nav nav-sidebar">
						<li ><a href="${s:mvcUrl('CC#formChamado').build()}">Abrir Chamado <span class="sr-only">(current)</span></a></li>
						<li ><a href="${s:mvcUrl('CC#listar').build()}">Meus Chamados</a></li>
					</ul>
					<ul class="nav nav-sidebar">
						<li><a href="">Atender Chamado</a></li>
						<li><a href="">Gerenciar Chamados</a></li>
					</ul>
				</div>
				       
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
					<!-- Enunciado Chamado -->
					<div class="form-group">
						<h2 class="sub-header">Meu Chamado</h2>
						<button type="submit" class="btn btn-warning">Cancelar Chamado</button>
					</div>
					<h3>${sucesso}</h3>
						         
					<!-- div Chamado -->
					<div  class="table-responsive">
						<table >
							<tr>
								<th class="col-md-8">Numero: ${chamado.numero}</th>
							<tr>
								<th class="col-md-6">Titulo: ${chamado.titulo}</th>
								<td class="col-md-3">Data da solicitação: <fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${chamado.data.time}"/></td>
								<td class="col-md-3">Status: ${chamado.status}:</td>
							</tr>
							<tr>
								<td class="col-md-8">Descrição: ${chamado.descricao}</td>
							</tr>
						</table>
					</div>
					<!-- div observações -->
					<div>
					
					</div>
				</div>
			</div>
		    
	</body>
</html>