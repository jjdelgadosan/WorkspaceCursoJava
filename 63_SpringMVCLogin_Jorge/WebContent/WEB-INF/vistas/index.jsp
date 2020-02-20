<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Bienvenido a su escritorio!!! ${param.nombre }</h1>
	<h2>${param.nombre} elige la opcion que prefieras</h2>
	</center>
	<br>
	<br>
	<a href="altaPelicula">1.- Dar de alta una pelicula...</a>
	<br>
	<br>
	<a href="listaPelicula">2.- Ver listado actual de peliculas...</a>
</body>
</html>