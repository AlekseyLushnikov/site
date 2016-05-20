
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order Table</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>
    <div class="btn-group">
        <a href="/itis-sem-web/order/add">
            <button type="button" class="btn btn-default btn-sm">Add Order</button>
        </a>
        <a href="/itis-sem-web/user/all">
            <button type="button" class="btn btn-default btn-sm">User Table</button>
        </a>
    </div>
<table class="table table-hover">
    <thead>
    <tr>
        <th>Id</th>
        <th>User</th>
        <th>Product</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.user.lastname}</td>
            <td>${order.product}</td>
            <td>${order.price}</td>
            <td><a href="/itis-sem-web/order/edit/${order.id}">
                <button type="button" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-pencil"></span></button>
            </a>
            </td>
            <td><a href="/itis-sem-web/order/delete/${order.id}">
                <button type="button" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-remove"></span></button>
            </a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
