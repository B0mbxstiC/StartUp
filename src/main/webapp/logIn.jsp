<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log In</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
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
	
	
	
	<!--CDN JQuery-->
  <script src="https://code.jquery.com/jquery-3.7.1.min.js"
    integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  <!--CDN Script Bootstrap-->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
  <!--JavaScript Native-->
  <script src="${pageContext.request.contextPath}/resources/js/script.js"></script>	
</body>
</html>