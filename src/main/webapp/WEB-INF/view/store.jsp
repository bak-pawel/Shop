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
<div class="w3-container w3-grey w3-center">
    <h1>Sklep elektrotechniczny</h1>
</div>
</br>
<a href="/login" class="w3-button w3-light-grey w3-ripple w3-right">Zaloguj</a>
<a href="/logout" class="w3-button w3-light-grey w3-ripple w3-right">Wyloguj</a>
<a href="/cart" class="w3-button w3-light-grey w3-ripple w3-right">Koszyk</a>
<a href="/braker" class="w3-button w3-light-grey w3-ripple w3-right">Obliczenie zabezpieczenia</a>
<a href="/lowVoltage" class="w3-button w3-light-grey w3-ripple w3-right">Spadek napięć</a>
<a href="/" class="w3-button w3-light-grey w3-ripple w3-right">Strona główna</a></br></br></br>
<c:forEach var="item" items="${items}">
<div class="w3-content">

    <div class="w3-row w3-margin">
        <div class="w3-container  w3-light-grey">
            <h1>${item.name}</h1>
        </div>

        <div class="w3-twothird w3-container">
            <div class="w3-third">
                <img src="img/${item.id}.jpg" style="width:50%;min-height:100px">
            </div>
            <p>
            <td>Ilość w paczce: ${item.volume}</td></br>
            <td>Cena za paczkę: ${item.price} zł</td></br>
            <td>Dostępność: ${item.availability} szt</td></br>
            </p>
        </div>
        <form method="get" action="/addtocart">
            <input name="availability" class="w3-section w3-ripple" style="height: 37px;width: 50px"/>
            <input name="id" value="${item.id}" hidden/>
            <input class="w3-button w3-section w3-light-grey w3-ripple" type="submit" value="Dodaj do koszyka"/></br></br></br>
        </form>


    </div>
    </c:forEach>
    <div class="w3-container  w3-light-grey">
        <h1>Niestety na chwilę obecną to wszystkie nasze produkty.</h1>
    </div>

</body>
</html>