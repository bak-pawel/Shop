<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div align="center">
    <form align="center" style="width: 300px" action="<c:url value='/login' />" method="post" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Logowanie</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td><input type="text" name="user"  placeholder="Login" /></td>
                    </tr>
                </div>
            </div>
            <div class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>

                        <td><input type="password" name="password" placeholder="Hasło"/></td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <input type="submit" value="Zaloguj" name="Zaloguj" class="w3-button w3-ripple w3-centerw 3-container w3-card-4 w3-light-grey w3-text-grey w3-margin" />
            </div>
        </div>
        <br>
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Rejestracja</h1>
        </div>
        <div class="w3-row w3-section w3-center" >
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/register" class="w3-button w3-ripple w3-centerw 3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">Zarejestruj się!</a>
            </div>
        </div>
    </form>
</div>
</body>
</html>