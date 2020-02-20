<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
h2{
	text-align: center;
	color: red;
}
</style>

</head>
<body>
	<!-- Se llama css in line -->
	<h1 style="text-align: center;color:green;font-family: bookman old style">Por favor, introduce tu usuario </h1>
	<h2 style="color:red">${error}</h2>
	<form action="/ServletLogin" method="post">
		<br/>
		<br/>
		<input type="text" name="user" value="usuario" />
    	<br/>
    	<input type="password" name="password" value="contraseña" />
		<br/>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>