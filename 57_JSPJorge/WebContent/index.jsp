<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Es una tecnologia que mezcla servlet y vista
	En este archivo podemos escribir contenido dinamico al usar tecnologia
	servlets. Un JSP, internamente es un servlet, todo lo que podemos hacer
	con un servlet lo podemos hacer con un JSP. Aun asi, los JSP quedan en la 
	parte de la vista, y unicamente deberian ser capaces de mostrar datos</h1>
	
<h1> En un servlet podemos mezclar codigo java con HTML gracias a la etiqueta scritler</h1>
	
<h1>esto seria un ejemplo de un scritler</h1>
		<%
		//esto es java, no HTML... esto es un comentario en java
		String s = "Hola mundo";
		int otravariable = 1;
		otravariable ++;
		
		%>
	<!-- Esto seria una mezcla entre java y HTML -->
		<table>

		<%
			for(int i=1;i<=10;i++){
		%>
			<tr>
			<td> 5 * </td>
			<td><%=i %> </td>
			<td> <%=i*8 %></td>
			<tr>
		<% 
			}
		%>
		</table>

	<hr/>
	<form action="ServletFormulario">
	
		Nombre: <input type="text" name="nombre"/>
		<br/>
		Peso: <input type="text" name="peso"/>
		<br/>
		<input type="submit" name="enviar"/>
		
	</form>



		<!-- Esto seria con HTML Que tiene que ser todo fijo -->
		<table>
		<tr>
			<td> 5 * </td>
			<td> 1 </td>
			<td> = 5 </td>
		<tr>
		</table>
		
		
		
</body>
</html>