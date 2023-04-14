<%@ page import="entidades.Pesquisa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmação</title>
</head>
<body>

	<%
	Pesquisa pesquisa = (Pesquisa) request.getAttribute("pesquisa");
	%>
	
	<h1> <%= pesquisa.getNome() %></h1>

</body>
</html>