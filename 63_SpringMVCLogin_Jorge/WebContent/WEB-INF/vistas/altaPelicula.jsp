<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos a nuestro pagina de alta de peliculas</h1>
<!--	<h2 style="color:blue">$(param.mensaje)</h2> --> Esto se pone para recibir un mensaje desde el controlador
	<form action="doAltaPelicula">
	Nombre: <input type="text" name="nombre"/>
	<br/>
	Director: <input type="text" name="director"/>
	<br/>
	Año de estreno : <input type="text" name="anio"/>
	<br/>
	Recaudacion : <input type="text" name="recaudacion"/>
	<br/>
	Valoracion : <input type="text" name="valoracion"/>
	<br/>
	<input type="submit" value="Enviar"/>
	</form>
</body>
</html>