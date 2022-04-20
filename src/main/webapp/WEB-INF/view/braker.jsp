<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<mvc:resources location="img" mapping="/files/**"></mvc:resources>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
</head>
<body>
</br><a href="/login" class="w3-button w3-light-grey w3-ripple w3-right">Zaloguj</a>
<a href="/logout" class="w3-button w3-light-grey w3-ripple w3-right">Wyloguj</a>
<a href="/cart" class="w3-button w3-light-grey w3-ripple w3-right">Koszyk</a>
<a href="/braker" class="w3-button w3-light-grey w3-ripple w3-right">Obliczenie zabezpieczenia</a>
<a href="/lowVoltage" class="w3-button w3-light-grey w3-ripple w3-right">Spadek napięć</a>
<a href="/" class="w3-button w3-light-grey w3-ripple w3-right">Strona główna</a></br></br></br>
<c:forEach var="brake" items="${brake}">
<div align="center">
    <form align="center" style="width: 800px" action="/braker" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Obliczenie zabezpieczenia dla napięcia 230V</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td><input name="numb" style="width: 400px" placeholder="Moc odbiornika w watach" /></td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <input type="submit" value="Oblicz" class="w3-button w3-ripple w3-centerw 3-container w3-card-4 w3-light-grey w3-text-grey w3-margin" />
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <h1 class="w3-center w3-#CCCCCC">Zabezpieczenie co najmniej ${brake}A</h1>
            </div>
        </div>

</form>
</div>
</c:forEach>
</br></br></br>
<c:forEach var="brake460" items="${brake460}">

    <div align="center">
        <form align="center" style="width: 800px" action="/braker" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="center-pill">
                <h1 class="w3-center w3-grey">Obliczenie zabezpieczenia dla napięcia 460V</h1>
            </div>
            <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
                <div class="w3-row w3-section w3-center">
                    <div class="w3-col"><i class="w3-xxlarge"></i></div>
                    <div class="w3-rest">
                        <tr>
                            <td><input name="numb460" style="width: 400px" placeholder="Moc odbiornika w watach" /></td>
                        </tr>
                    </div>
                </div>
            </div>
            <div class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
                <div class="w3-rest">
                    <input type="submit" value="Oblicz" class="w3-button w3-ripple w3-centerw 3-container w3-card-4 w3-light-grey w3-text-grey w3-margin" />
                </div>
            </div>
            <div class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge "></i></div>
                <div class="w3-rest">
                    <h1 class="w3-center w3-#CCCCCC">Zabezpieczenie co najmniej ${brake460}A</h1>
                </div>
            </div>
        </form>
    </div>
</c:forEach>

</body>
</html>