<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--  podemos acceder de varias maneras a los atributos y a los parametros
	
	1.- via scritler, que se usa meno porque se considera obsoleta 
	
	 -->
	<%	//asi accedemos a los parametros
		String nombreParametro = request.getParameter("nombre");
		String pesoParametro = request.getParameter("peso");

		//asi accedemos a los atributos. Como devuelve un objeto, siempre hay que castear
		Double l = (Double)request.getAttribute("l");
		String n = (String)request.getAttribute("n");
	%>
	Nombre: <%=n %>
	<br/>
	Peso en Kilos: <%=pesoParametro %>
	<br/>
	Peso en libras: <%=l %>
	
	<!--  La manera buena de accer.
		2.- Via JSP Expresion Lenguage. ${EXPRESION}
	 -->
	 <hr/>
	Nombre: ${n} 
	<br/>
	Peso en libras: ${l}  
	<br/>
		
</body>
</html>