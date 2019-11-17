<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div>

    <h3>Register</h3>
    <form:form name='registerForm' method="POST" action="/register" modelAttribute="user">

        <table>
            <tr>
                <td>First Name:</td>
                <td><form:input path="firstName"/></td>
            </tr>
            <tr>
                <td>Last name:</td>
                <td><form:input path="lastName" readonly="${update}"/></td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><form:input path="userName" readonly="${update}"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input type="password" path="password" readonly="${update}"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" readonly="${update}"/></td>
            </tr>
            <tr>
                <td colspan='2'><input  name="submit" type="submit" value="Add"/></td>
            </tr>
        </table>

    </form:form>

    <a href="/login">Powrót do logowania</a>
</div>

</body>
</html>