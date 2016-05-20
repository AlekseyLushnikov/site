
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script></head>
<body>
<form:form method="POST" action="/itis-sem-web/order/add" modelAttribute="order">
    <table class="table table-hover">
        <tr>
            <td><label>User: </label></td>
            <td>
                <form:select path="userId">
                    <form:options items="${users}" itemLabel="lastname" itemValue="id" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td><label>Product</label></td>
            <td><form:input path="product"/></td>
        </tr>
        <tr>
            <td><label>Price: </label></td>
            <td><form:input path="price"/></td>
        </tr>
    </table>
<div class="btn-group">
    <button type="submit" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-pencil"></span> Save</button>
    <a href="/itis-sem-web/order/all">
        <button type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
    </a>
    </div>
</form:form>
</body>
</html>