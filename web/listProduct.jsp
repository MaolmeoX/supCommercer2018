<%@ page import="java.util.List" %>
<%@ page import="fr.imie.supcommerce.model.Product" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: mrarn
  Date: 01/06/2018
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="include.jsp"/>
    <title>Liste des produits</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<%List<Product> products = (ArrayList) request.getAttribute("products"); %>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Description</th>
            <th scope="col">Price</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0; i < products.size(); i++) { %>
        <% Product product = products.get(i); %>
        <tr>
            <th scope="row"><%= product.getId()%></th>
            <td><%= product.getName()%></td>
            <td><%= product.getDescription()%></td>
            <td><%= product.getPrice()%></td>
            <td><a class="btn btn-primary" href="/showProduct?id=<%= product.getId() %>" role="button">Show</a></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
