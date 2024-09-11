<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Desafío JSP</title>
</head>
<body>
    <h1>Listado de Números del 1 al 10</h1>
    <ul>
        <% for (int i = 1; i <= 10; i++) { %>
            <li><a href="NumberServlet?num=<%= i %>">Número <%= i %></a></li>
        <% } %>
    </ul>
</body>
</html>
