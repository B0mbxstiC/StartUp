<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-info-subtle">
	
	<div class="container">
		<h1 class="text-center my-5">Ingresa los datos del nuevo usuario</h1>
		
	<form action="Registro" method="post" class="row m-5 p-5">
		  <div class="mb-3 col-md-6">
		    <label for="txtNombre" class="form-label">Nombre</label>
		    <input type="text" class="form-control" id="txtNombre" name="txtNombre" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtCorreo" class="form-label">Correo</label>
		    <input type="text" class="form-control" id="txtCorreo" name="txtCorreo" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtNick" class="form-label">Nick</label>
		    <input type="text" class="form-control" id="txtNick" name="txtNick" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtContrasenia" class="form-label">Contraseña</label>
		    <input type="password" class="form-control" id="txtContrasenia" name="txtContrasenia" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtContraseniaDos" class="form-label">Repetir contraseña</label>
		    <input type="password" class="form-control" id="txtContraseniaDos" name="txtContraseniaDos" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtPeso" class="form-label">Peso (kg)</label>
		    <input type="text" class="form-control" id="txtPeso" name="txtPeso" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtDireccion" class="form-label">Direccion</label>
		    <input type="text" class="form-control" id="txtDireccion" name="txtDireccion" required>
		  </div>
		  
		  <div class="mb-3 col-md-6">
		    <label for="txtNumeracion" class="form-label">Numeración</label>
		    <input type="text" class="form-control" id="txtNumeracion" name="txtNumeracion" required>
		  </div> 
		  
		  <div class="my-3 col-md-12">
			  <select class="form-select" aria-label="Opciones de rol" id="txtRol" name="txtRol">			 		
			    	<option value="" disabled selected>Rol a elegir</option>
			    	<option value="1">User</option>
			    	<option value="2">Admin</option>
			  </select>
		  </div>  		   
		  
		  <button type="submit" class="btn btn-primary my-3 py-3">Enviar registro</button>
		  
	</form>
		
	</div>
	

</body>
</html>