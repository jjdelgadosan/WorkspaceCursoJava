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
	<center>
		<h1>Los datos de tu pelicula son : </h1>
	</center>
	<table style="margin-left: auto;margin-right: auto;" border="1">
		<tr>
			<td>Nombre de la pelicula:</td>
			<td>${param.nombre }</td>
		</tr>
		<tr>
			<td>Director:</td>
			<td>${param.director }</td>
		</tr>
		<tr>
			<td>Año de estreno:</td>
			<td>${param.anio }</td>
		</tr>
		<tr>
			<td>Recaudacion :</td>
			<td>${param.recaudacion }</td>
		</tr>
		<tr>
			<td>Valoracion:</td>
			<td>${param.valoracion }</td>
		</tr>
	</table>

</body>
</html>