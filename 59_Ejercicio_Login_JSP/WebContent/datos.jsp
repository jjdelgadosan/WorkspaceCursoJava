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
	<h1>Estos son los datos del usuario</h1>
	<hr/>
	<table border="1">
		<tr>
			<td>Usuario:</td>
			<td>${nombre}</td>
		</tr>
			<td>Categoria:</td>
			<td>${categoria}</td>
		</tr>
			<td>Años:</td>
			<td>${años}</td>
		</tr>
			<td>Direccion:</td>
			<td>${direccion}</td>
		</tr>
	</table>
	<form action="ServletInfo" method="post">
		<h1>Pulse el boton para ver mas informacion</h1>
		<input type="submit" value="Mas info">
	</form>
</center>
</body>
</html>