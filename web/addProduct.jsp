<%--
  Created by IntelliJ IDEA.
  User: mrarn
  Date: 01/06/2018
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product</title>
    <jsp:include page="include.jsp"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">

    <form action="/auth/addProduct " method="post">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter name">
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <input type="text" class="form-control" id="description" name="description" placeholder="Enter description">
        </div>
        <div class="form-group">
            <label for="price">Name</label>
            <input type="number" class="form-control" id="price" name="price" min="0" step="0.01">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
