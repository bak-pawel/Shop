<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body bgcolor="#DCDCDC">
<div align="center">
    <div style="width:400px">
        <h2 class="w3-center w3-grey" style="width: 300px">Rejestracja</h2>
        <form:form  method="POST" action="/register" modelAttribute="user"
                    class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin w3-center" cssStyle="width: 300px">

            <div style="width: 250px" class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
                <div class="w3-rest">
                    <form:input class="w3-input" path="firstName" placeholder="Imię"/>
                </div>
            </div>

            <div style="width: 250px" class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
                <div class="w3-rest">
                    <form:input class="w3-input" path="lastName" placeholder="Nazwisko"/>
                </div>
            </div>

            <div style="width: 250px" class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-pencil"></i></div>
                <div class="w3-rest">
                    <form:input class="w3-input" path="userName" placeholder="Login"/>
                </div>
            </div>

            <div style="width: 250px" class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-pencil"></i></div>
                <div class="w3-rest">
                    <form:input class="w3-input" path="password" type="password" placeholder="Passowrd"/>
                </div>
            </div>

            <div style="width: 250px" class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-envelope-o"></i></div>
                <div class="w3-rest">
                    <form:input class="w3-input" path="email" placeholder="Email" size=""/>
                </div>
            </div>

            <div style="width: 250px" class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
                <div class="w3-rest">
                    <input class="w3-button w3-ripple w3-centerw 3-container w3-card-4 w3-light-grey w3-text-grey w3-margin" name="submit" type="submit" value="Add"/>
                </div>
            </div>
        </form:form>
        <div style="width: 300px" class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/login" class="w3-button w3-grey w3-ripple w3-center">Powrót do logowania</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>