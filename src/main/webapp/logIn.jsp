<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log In</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<% String mensaje = (String)request.getAttribute("mensaje"); %>
</head>
<body class="bg-info-subtle">
	
	<div class="container">
	<h1 class="m-5 py-5 text-center">Ingreso de usuarios</h1>
	
	<form class="row py-5" action="LogInServlet" method="post">
		  	<div class="mb-3 col-md-6">
			    <label for="txtCorreo" class="form-label">Correo electrónico</label>
			    <input type="text" class="form-control" id="txtCorreo" name="txtCorreo" required>
			</div>
		    <div class="mb-3 col-md-6">
			    <label for="txtContrasenia" class="form-label">Contraseña</label>
			    <input type="password" class="form-control" id="txtContrasenia" name="txtContrasenia" required>
		    </div>
		<button type="submit" class="btn btn-primary my-3 py-3">Log In</button>
	
	<%if (mensaje != null){ %>
	<div>
		<p><%= mensaje %></p>
	</div>
	<%} %>
	
	  
	</form>
	</div>
	
	
</body>
</html>