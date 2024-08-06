<%@page import="com.praxis.model.dto.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<% Usuario usuario = (Usuario)request.getAttribute("usuario"); %>
</head>
<body class="bg-info-subtle">
	
	<div class="container my-5 py-5 text-centerga">
	
		<h1>Bienvenido a nuestra plataforma de usuarios</h1>
		<p>A continuación, tus datos personales</p>
		
		<table class="table">
  <thead>
    <tr>
      <th scope="col">Identificador</th>
      <th scope="col">Usuario</th>
      <th scope="col">Correo</th>
      <th scope="col">Nick</th>
      <th scope="col">Peso</th>
    </tr>
  </thead>
  <tbody>

    <tr>
      <td><%= usuario.getId() %> </td>
      <td><%= usuario.getNombre()%> </td>
      <td><%= usuario.getCorreo()%> </td>
      <td><%= usuario.getNick()%> </td>
      <td><%= usuario.getPeso() %> </td>
    </tr>
  
  </tbody>
</table>
	
	</div>
	
	
</body>
</html>