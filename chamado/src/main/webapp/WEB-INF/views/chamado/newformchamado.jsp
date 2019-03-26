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
		<script src="resources/js/bootstrap.min.js" ></script>
	
		<meta charset="UTF-8">
		<title>Chamado</title>
	</head>
	
	
	<body>
		<%@ include file="/WEB-INF/views/cabecalho.jsp" %>
	    
	  <div class="container-fluid">
	   
      <div class="row">
      
      	<!-- div menu lateral -->
        <div class="col-sm-3 col-md-2 sidebar">
	        <ul class="nav nav-sidebar">
	            <li class="active"><a href="${s:mvcUrl('CC#formChamado').build()}">Abrir Chamado <span class="sr-only">(current)</span></a></li>
	            <li ><a href="${s:mvcUrl('CC#listar').build()}">Meus Chamados</a></li>
	          </ul>
	        <ul class="nav nav-sidebar">
	        <li><a href="">Atender Chamado</a></li>
            <li><a href="">Gerenciar Chamados</a></li>
          </ul>
        </div>
        
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        	<div class="row placeholders">
	        </div>
			<!-- Enunciado lista -->
			<h2 class="sub-header">Abrir Chamado</h2>
			<h3>${sucesso}</h3>
	         
			<!-- div Form Chamado -->
	        <div  class="table-responsive form">
	         	<form:form action= "${s:mvcUrl('CC#gravar').build()}" method="POST" commandName="chamado">
					<div class="form-group">
						<label>Titulo</label>
						<input type="text" name="titulo" class="form-control">
						<form:errors path="titulo"/>
					</div>
					
					<div class="form-group">
						<label>Descrição</label>
						<textarea rows="10" cols="80" name="descricao" class="form-control"></textarea>
						<form:errors path="descricao"/>
					</div>
					
					<div>
						
						<div class="pull-right">
							<button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
						</div>		
					</div>
			
			
				</form:form>
	         </div>
	        </div>
    	</div>
    </div>
	
	
    
	</body>
</html>