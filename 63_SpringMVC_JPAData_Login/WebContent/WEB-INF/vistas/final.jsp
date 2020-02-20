<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
	<h1>ENHORABUENA TE HAS DADO DE ALTA CORRECTAMENTE</h1>
	<hr/>
	<table style="margin-left: auto;margin-right: auto;" border="1">
		<tr>
			<td>Nombre:</td>
			<td>${param.nombre }</td>
		</tr>
		<tr>
			<td>Edad:</td>
			<td>${param.edad }</td>
		</tr>
		<tr>
			<td>Peso:</td>
			<td>${param.peso }</td>
		</tr>
	
	</table>
</div>
	<!-- Esto siempre es GET -->
			<a href="ServletDetalle?nombre=login.jsp">Pulse aquí para volver a la pagina de login</a>
</body>
</html>