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
		<h1>Buenos días, por favor introduzca su usuario y contraseña</h1>
		<h3 style="color:red">${param.error}</h3>
		<form action="mostrarRegistro" method="post">
			Usuario: <input type="text" name="usuario"/>
			<br/>
			Password: <input type="password" name="password"/>
			<br/>
			<input type="submit" value="Enviar"/>
			<br/>
			</form>
		</center>
	<h1>Pulse el boton para registrarse</h1>
	<input type="button" value="Registrarse" onclick="location.href = 'registro'" />
</body>
</html>