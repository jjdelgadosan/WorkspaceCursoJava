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
	<h1>Bienvenido, se ha conectado correctamente</h1>
	<hr/>
	<table border="1">
		<tr>
			<td>Usuario:</td>
			<td>${user}</td>
		</tr>
	</table>
	<form action="ServletInfo" method="post">
		<h1>Pulse el boton para ver mas informacion</h1>
		<input type="submit" value="Mas info">
	</form>
</center>
</body>
</html>