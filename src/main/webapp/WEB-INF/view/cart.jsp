<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Twój koszyk: </h1>
<a href="/logout">Wyloguj</a></br></br>
<a href="/">Back to home</a></br></br></br>



<c:forEach var="item" items="${itemsInCart}">
<tr>

    <td>Nazwa: ${item.drink.name}</td>
    <td>Ilość: ${item.amount}</td>
    <td>Cena za szt: ${item.drink.price}zł</td>
    <td>Cena: ${item.amount*item.drink.price}zł</td>
    <a href="/delete/${item.id}">Delete</a></br></br></br>

</tr>
</c:forEach>



<a href="/buy">Buy</a>



</body>
</html>