<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Formularz logowania</title>
</head>
<body>
<h1>Formularz logowania</h1>
<form action="<c:url value='/login' />" method="post">
    <table style="with: 100%">
        <tr>
            <td>Nazwa użytkownika</td>
            <td><input type="text" name="user" /></td>
        </tr>
        <tr>
            <td>Hasło</td>
            <td><input type="password" name="password" /></td>
        </tr>
    </table>
    <input type="submit" value="submit" name="Zaloguj" />
</form>
</body>
</html>