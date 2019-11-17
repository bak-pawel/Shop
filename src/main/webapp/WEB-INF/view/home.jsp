<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<mvc:resources location="img" mapping="/files/**"></mvc:resources>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
</head>
<body>
<div class="w3-container w3-blue w3-center">
    <h1>Sklep z wodą</h1>
</div>
</br>
<a href="/logout" class="w3-button w3-blue w3-ripple w3-right">Wyloguj</a></br></br>
<a href="/cart" class="w3-button w3-blue w3-ripple w3-right">Koszyk</a>
<c:forEach var="drink" items="${drinks}">
<div class="w3-content">

    <div class="w3-row w3-margin">
        <div class="w3-container  w3-blue">
            <h1>${drink.name}</h1>
        </div>

        <div class="w3-twothird w3-container">
            <div class="w3-third">
                <img src="img/${drink.id}.jpg" style="width:50%;min-height:100px">
            </div>
            <p>
            <td>Pojemność: ${drink.volume}</td></br>
            <td>Cena: ${drink.price}</td></br>
            <td>Dostępność: ${drink.availability} Szt</td></br>
            </p>
        </div>
        <form method="get" action="/addtocart">
            <input name="availability" class="w3-section w3-ripple  " style="height: 37px;width: 50px"/>
            <input name="id" value="${drink.id}" hidden/>
            <input class="w3-button w3-section w3-blue w3-ripple" type="submit" value="Dodaj do koszyka"/></br></br></br>
        </form>


    </div>
</c:forEach>
    <div class="w3-container  w3-blue">
        <h1>Niestety na chwilę obecną to wszystkie nasze produkty</h1>
    </div>

</body>
</html>