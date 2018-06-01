<%@ page import="fr.imie.supcommerce.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: mrarn
  Date: 01/06/2018
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="include.jsp"/>
    <title>Show product</title>
</head>
<body>
    <jsp:include page="header.jsp"/>
    <% Product product = (Product) request.getAttribute("product"); %>
    <div class="d-flex flex-column bd-highlight mb-3">
        <div class="p-2 bd-highlight"><%= product.getId()%></div>
        <div class="p-2 bd-highlight"><%= product.getName()%></div>
        <div class="p-2 bd-highlight"><%= product.getDescription()%></div>
        <div class="p-2 bd-highlight"><%= product.getPrice()%></div>
    </div>
</body>
</html>
