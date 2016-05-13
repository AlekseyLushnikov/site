<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Form</h1>
${error}
<c:if test="${user != null}">
<form:form method="POST" action="/user/add" modelAttribute="user">
    <table>
        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td><form:input path="lastname"/></td>
        </tr>
        <tr>
            <td><form:input path="firstname"/></td>
        </tr>
        <tr>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</c:if>
</body>
</html>