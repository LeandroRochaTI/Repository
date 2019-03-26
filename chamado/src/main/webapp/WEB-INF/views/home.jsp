<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>chamado</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/cabecalho.jsp" %>
	
	<div class="container-fluid">
	   
      <div class="row">
      
      	<!-- div menu lateral -->
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
			<!-- Enunciado home -->
			<h2 class="sub-header">Seja Bem vindo ${usuario.nome}!</h2>
	         
			<!-- div conteudo home -->
	        <div  class="table-responsive form">
	         	
	        </div>
	        </div>
    	</div>
    </div>
	

</body>
</html>