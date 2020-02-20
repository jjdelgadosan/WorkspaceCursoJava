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
		<h1>Bienvenidos al listado de peliculas de nuestra pagina web</h1>
		<h2>Selecciona una pelicula para ver sus datos</h2>
	</center>
	
		<table border=1>
			<tr>
				<th>Pelicula</th>
			</tr>
			 <c:forEach items="${listaPeliculas}" 
			 	var="pelicula" varStatus="i">
			 	<tr>
             		<td><a href="detalle?id=${pelicula.id}">${pelicula.nombre }</a></td>
             		<td>${pelicula.director }</td>
             	</tr>
             </c:forEach>
		</table>

</body>
</html>