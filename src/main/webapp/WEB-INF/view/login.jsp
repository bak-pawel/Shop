<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Formularz logowania</title>
</head>

<body>
<h1>Formularz logowania</h1>
<form action="/login" method="post">
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
    <input type="submit" value="Submit" />
</form>
</body>

</html>