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
<div style="text-align: center;">
	<h1>ENHORABUENA TE HAS LOGADO CORRECTAMENTE ${param.nombre }</h1>
	<hr/>
</div>
	<!-- Esto siempre es GET -->
<a href="ServletDetalle?nombre=www.google.es">Pulse aquí para volver irte a google a hacer algo de interes</a>
</body>
</html>