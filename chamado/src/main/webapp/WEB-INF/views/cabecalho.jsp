<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="resources/css/bootstrap.min.css" >
		<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="resources/css/menus.css">
	
		<meta charset="UTF-8">
		<title>Chamado</title>
	</head>
	
	
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
		<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
		<span class="sr-only">Toggle navigation</span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="${s:mvcUrl('HC#home').build()}">Chamado</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav navbar-right">
		<li><a>Usuario: nome</a></li>
		<li><a href="${s:mvcUrl('UC#perfil').build()}">Perfil</a></li>
		<li><a href="${s:mvcUrl('UC#configuracoes').build()}">Configurações</a></li>
		</ul>
		</div>
		</div>
		</nav>
			    
	</body>
</html>