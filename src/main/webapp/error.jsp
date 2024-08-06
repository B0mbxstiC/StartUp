<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-info-subtle">
	
	<div class="container text-center">
		<h1>Has tenido un error en el ingreso de la información, por favor inténtalo de nuevo.</h1>
		<p>${error}</p>
		
		<button class="btn text-white"><a href="InicioServlet">Volver a inicio</a></button> 
	</div>
	
</body>
</html>