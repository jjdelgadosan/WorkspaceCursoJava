<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;color:green;font-family: bookman old style">Bienvenidos a nuestros formularios </h1>
	<form action="ServletFormularioJsp" method="post">
		Nombre: <input type="text" name="nombre"/>
		<br/>
		Direccion: <input type="text" name="direccion"/>
		<br/>
		Email: <input type="email" name="email"/>
		<br/>
		RAM: 
		<br/>
		<h3>Elija la ram</h3>
		<input type="radio" name="ram" value="8">8GB
		<br/>
		<input type="radio" name="ram" value="16">16GB
		<br/>
		<input type="radio" name="ram" value="32">32GB
		<br/>
		
		Procesador: 
		<br/>
		<h3>Elija el procesador</h3>
		<input type="radio" name="procesador" value="i3">Intel i3
		<br/>
		<input type="radio" name="procesador" value="i5">Intel i5
		<br/>
		<input type="radio" name="procesador" value="i7">Intel i7
		<br/>
		<h3>Elija opciones</h3>
		<br/><input type="checkbox" name="opciones" value="impresora">Impresora
		<br/><input type="checkbox" name="opciones" value="raton">Raton
		<br/><input type="checkbox" name="opciones" value="monitor">Monitor
		<br/><input type="checkbox" name="opciones" value="teclado">Teclado	
		<h3>Comentarios adicionales</h3>
		<textarea rows="10" cols="50" name="comentarios"></textarea>
		<br/>
		<input type="submit" value="Enviar">
	</form>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
</body>
</html>