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
    <h2 class="w3-center w3-text-blue">Rejestracja</h2>
    <form:form method="POST" action="/register" modelAttribute="user" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin" >
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
            <div class="w3-rest">
                <form:input class="w3-input" path="firstName" placeholder="Imię"/>
<%--                <tr>--%>
<%--                    <td>First Name:</td>--%>
<%--                    <td><form:input path="firstName"/></td>--%>
<%--                </tr>--%>
            </div>
        </div>

        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
            <div class="w3-rest">
                <form:input class="w3-input" path="lastName" placeholder="Nazwisko"/>
<%--                <tr>--%>
<%--                    <td>Last name:</td>--%>
<%--                    <td><form:input path="lastName" readonly="${update}"/></td>--%>
<%--                </tr>--%>
            </div>
        </div>

        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-pencil"></i></div>
            <div class="w3-rest">
                <form:input class="w3-input" path="userName" placeholder="Login"/>
<%--                <tr>--%>

<%--                    <td>Username:</td>--%>
<%--                    <td><form:input path="userName" readonly="${update}"/></td>--%>
<%--                </tr>--%>
            </div>
        </div>

        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-pencil"></i></div>
            <div class="w3-rest">
                <form:input class="w3-input" path="password" type="password"  placeholder="Passowrd"/>
<%--                <tr>--%>
<%--                    <td>Password:</td>--%>
<%--                    <td><form:input type="password" path="password" readonly="${update}"/></td>--%>
<%--                </tr>--%>
            </div>
        </div>

        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-envelope-o"></i></div>
            <div class="w3-rest">
                <form:input class="w3-input" path="email" placeholder="Email" size=""/>
<%--                <tr>--%>
<%--                    <td>Email:</td>--%>
<%--                    <td><form:input path="email" readonly="${update}"/></td>--%>
<%--                </tr>--%>
            </div>
        </div>

    <div class="w3-row w3-section w3-center">
        <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
        <div class="w3-rest">
            <input class="w3-button w3-blue w3-ripple w3-center" name="submit" type="submit" value="Add"/>
        </div>
    </div>
<%--        <p class="w3-center">--%>
<%--            <input  name="submit" type="submit" value="Add"/>--%>
<%--        </p>--%>
    </form:form>
    <div class="w3-row w3-section w3-center">
        <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
        <div class="w3-rest">
    <a href="/login" class="w3-button w3-blue w3-ripple w3-left">Powrót do logowania</a>
        </div>
    </div>




<%--    <h3>Register</h3>--%>
<%--    <form:form name='registerForm' method="POST" action="/register" modelAttribute="user">--%>

<%--        <table>--%>
<%--            <tr>--%>
<%--                <td>First Name:</td>--%>
<%--                <td><form:input path="firstName"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Last name:</td>--%>
<%--                <td><form:input path="lastName" readonly="${update}"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Username:</td>--%>
<%--                <td><form:input path="userName" readonly="${update}"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Password:</td>--%>
<%--                <td><form:input type="password" path="password" readonly="${update}"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Email:</td>--%>
<%--                <td><form:input path="email" readonly="${update}"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td colspan='2'><input  name="submit" type="submit" value="Add"/></td>--%>
<%--            </tr>--%>
<%--        </table>--%>

<%--    </form:form>--%>

<%--    <a href="/login">Powrót do logowania</a>--%>
<%--</div>--%>

</body>
</html>