<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<!-- Se llama css in line -->
	<h1 style="text-align: center;color:green;font-family: bookman old style">Bienvenidos a nuestros formularios </h1>
		<!-- Asi accedemos a los parametros -->
	<h2 style="color:orange">${param.error}</h2>
	<form action="doRegistro" method="get">
		Nombre: <input type="text" name="nombre"/>
		<br/>
		Password: <input type="password" name="password"/>
		<br/>
		Edad: <input type="text" name="edad"/>
		<br/>
		Peso: <input type="text" name="peso"/>
		<br/>
		<input type="submit" value="Enviar">
	</form>
	
	
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
</body>
</body>
</html>