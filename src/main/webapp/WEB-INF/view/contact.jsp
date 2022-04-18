<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<mvc:resources location="img" mapping="/files/**"></mvc:resources>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<body>
<div>
    <h1 class="w3-center w3-grey">Kontakt</h1>
</div>
<a href="/login" class="w3-button w3-light-grey w3-ripple w3-right">Zaloguj</a>
<a href="/logout" class="w3-button w3-light-grey w3-ripple w3-right">Wyloguj</a>
<a href="/cart" class="w3-button w3-light-grey w3-ripple w3-right">Koszyk</a>
<a href="/braker" class="w3-button w3-light-grey w3-ripple w3-right">Obliczenie zabezpieczenia</a>
<a href="/lowVoltage" class="w3-button w3-light-grey w3-ripple w3-right">Spadek napięć</a>
<a href="/" class="w3-button w3-light-grey w3-ripple w3-right">Strona główna</a></br></br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/contact" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">

        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td><b>PABLITO</b></td></br>
                        <td>Paweł Bąk</td></br>
                        <td>Ul.Grunwaldzka 38B/35</td></br>
                        <td>60-786 Poznań</td></br>
                        <td><a href="tel:+727933476">Zadzwoń</a></td></br>
                        <td><a href="mailto:pawelbak96@gmail.com">Napisz wiadomość</a></td></br></br></br>

                        <a href="/" class="w3-button w3-grey w3-ripple w3-center">Powrót do strony głównej</a>

                    </tr>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>

