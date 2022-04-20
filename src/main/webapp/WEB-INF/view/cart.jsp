<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
</head>
<body>
<div class="w3-container w3-grey w3-center">
    <h1>Koszyk</h1>
</div>
</br>
<a href="/login" class="w3-button w3-light-grey w3-ripple w3-right">Zaloguj</a>
<a href="/logout" class="w3-button w3-light-grey w3-ripple w3-right">Wyloguj</a>
<a href="/cart" class="w3-button w3-light-grey w3-ripple w3-right">Koszyk</a>
<a href="/braker" class="w3-button w3-light-grey w3-ripple w3-right">Obliczenie zabezpieczenia</a>
<a href="/lowVoltage" class="w3-button w3-light-grey w3-ripple w3-right">Spadek napięć</a>
<a href="/" class="w3-button w3-light-grey w3-ripple w3-right">Strona główna</a></br></br></br>
<c:forEach var="item" items="${itemsInCart}">
<div class="w3-content">

    <div class="w3-row w3-margin">
        <div class="w3-container  w3-light-grey">
            <h1>${item.item.name}</h1></br>
        </div>

        <div class="w3-twothird w3-container">
            <div class="w3-third">
                <img src="img/${item.item.id}.jpg" style="width:50%;min-height:100px">
            </div>
            <p>
            <td>Ilość: ${item.amount}</td>
            <td>Cena za szt: ${item.item.price}zł</td></br>
            <td>Suma: ${item.amount*item.item.price}zł</td>
            </p>
        </div>
        </br>
                <a href="/delete/${item.id}"class="w3-button w3-grey w3-light-grey w3-right">Delete</a></br></br></br>

    </div>
    </c:forEach>
    </br></br></br>
    <a href="/buy" class="w3-button w3-grey w3-light-grey w3-right">Buy</a>
    <a href="/store" class="w3-button w3-grey w3-light-grey w3-left">Powrót do zakupów</a>

</body>
</html>