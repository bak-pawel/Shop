<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
<div>

    <h3>Register</h3>

    <form name='registerForm'
          action="<c:url value='/register'/>" method='POST'>

        <table>
            <tr>
                <td>First name:</td>
                <td><input class= type='text' name='username'></td>
            </tr>
            <tr>
                <td>Last name:</td>
                <td><input class= type='text' name='lastName'></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input class= type='text' name='email'></td>
            </tr>
            <tr>
                <td>Login:</td>
                <td><input class= type='text' name='login'></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password' /></td>
            </tr>
            <tr>
                <td colspan='2'><input  name="submit" type="submit" value="submit" /></td>
            </tr>
        </table>

    </form>
    <a href="/login">Powrót do logowania</a>
</div>

</body>
</html>