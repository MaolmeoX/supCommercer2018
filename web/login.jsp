<%--
  Created by IntelliJ IDEA.
  User: mrarn
  Date: 01/06/2018
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <jsp:include page="include.jsp"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <form action="/login" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username" aria-describedby="emailHelp" placeholder="Enter username">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
