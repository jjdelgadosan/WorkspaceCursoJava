<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="calculator">
 
 <% int n = Integer.parseInt(request.getParameter("numero")); %>
    <h1>Tabla de multiplicar del numero ${param.numero }</h1>
    <table>
      <%
        for(int i = 0; i < 11; i++) {
          out.println("<tr><td>" + i + " x " + n + "</td><td> = </td><td>" + i * n + "</td></tr>");
        }
      %>
    </table>


    <p>Haz algun calculo para ver el resultado.</p>
    <input type="textfield" name="ans" value="">
    <br>
    <input type="button" value="1" onClick="document.calculator.ans.value+='1'">
    <input type="button" value="2" onClick="document.calculator.ans.value+='2'">
    <input type="button" value="3" onClick="document.calculator.ans.value+='3'">
    <input type="button" value="+" onClick="document.calculator.ans.value+='+'">
    <br>
    <input type="button" value="4" onClick="document.calculator.ans.value+='4'">
    <input type="button" value="5" onClick="document.calculator.ans.value+='5'">
    <input type="button" value="6" onClick="document.calculator.ans.value+='6'">
    <input type="button" value="-" onClick="document.calculator.ans.value+='-'">
    <br>
    <input type="button" value="7" onClick="document.calculator.ans.value+='7'">
    <input type="button" value="8" onClick="document.calculator.ans.value+='8'">
    <input type="button" value="9" onClick="document.calculator.ans.value+='9'">
    <input type="button" value="*" onClick="document.calculator.ans.value+='*'">
    <br>
    <input type="button" value="0" onClick="document.calculator.ans.value+='0'">
    <input type="reset" value="c">
    <input type="button" value="/" onClick="document.calculator.ans.value+='/'">
    <input type="button" value="=" onClick="document.calculator.ans.value=eval(document.calculator.ans.value)">
    </form>
	
	
</body>
</html>