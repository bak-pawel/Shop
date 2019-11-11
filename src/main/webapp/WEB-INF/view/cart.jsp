<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Twój koszyk: </h1>
<a href="/">Back to home</a>

<a href="/logout">Wyloguj</a>

<c:forEach var="item" items="${itemsInCart}">
<tr>

    <td>Nazwa: ${item.drink.name}</td></br>
    <td>Ilość: ${item.amount}</td>
    <td>Cena: ${item.drink.price}</td>
    <a href="/delete/${item.id}">Delete</a>

</tr>
</c:forEach>

<a href="/buy">Buy</a>



</body>
</html>