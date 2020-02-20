<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  table{
    margin-left:auto; 
    margin-right:auto;
  }
</style>
</head>
<body>
	<div style="text-align: center;">
		<h1>Alta y listado de productos</h1>
		<form action="alta">
			<table>
				<tr>
					<td>Indique el nombre del producto :</td>
					<td><input type="text" name="nombre"/></td>
					<td style="color:red">${param.errorNombre }</td>
				</tr>
				<tr>
					<td>Indique el precio del producto :</td>
					<td><input type="text" name="precio"/></td>
					<td style="color:red">${param.errorPrecio }</td>
				</tr>
				<tr>
					<td>Indique la categoria del producto :</td>
					<td><input type="text" name="categoria"/></td>
					<td style="color:red">${param.errorCategoria }</td>
				</tr>
			</table>
			<br/>
			<input type="submit" value="Alta"/>
			<br>
		</form>
		 
		<br/>
		<table>
			<tr>
				<th>ID</th>
				<th>Nombre </th>
				<th>Precio </th>
				<th>Categoria </th>
			</tr>
			<c:forEach items="${lista}" var="p">
				<tr>
					<td><c:out value="${p.id}"></c:out></td>
					<td><c:out value="${p.nombre}"></c:out></td>
					<td><c:out value="${p.precio}"></c:out></td>
					<td><c:out value="${p.categoria}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>