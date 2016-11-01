<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Pagina de prueba</title>
	</head>
	<body>
		<!-- EL igual es para mostrar el codigo java -->
		la hora es <%= new Date()%>
		<h1>Nombre: <%= request.getParameter("nombre") %></h1>
	</body>
</html>