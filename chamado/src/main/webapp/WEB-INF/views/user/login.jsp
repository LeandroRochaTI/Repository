<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="resources/css/bootstrap.min.css" >
	
		<!-- Optional theme -->
		<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="resources/js/bootstrap.min.js"  ></script>
	
		<!-- Custom styles for this template -->
	    <link href="resources/css/login.css" rel="stylesheet">
		
		<meta charset="UTF-8">
		<title>Chamado</title>
	</head>
<body>
	<div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Usuario</label>
        <input type="text" name="username" class="form-control" placeholder="Usuario" required autofocus>
        <label for="inputPassword" class="sr-only">Senha</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Senha" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div>
</body>
</html>