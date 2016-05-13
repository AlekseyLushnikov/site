<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Last Name</th>
            <th>First Name</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.lastname}</td>
            <td>${user.firstname}</td>
            <td>${user.age}</td>
            <td><a href="/user/edit/${user.id}">Edit</a></td>
            <td><a href="/user/delete/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>