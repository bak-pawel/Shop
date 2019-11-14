<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Twój koszyk: </h1>
<a href="/logout">Wyloguj</a></br></br>
<a href="/">Back to home</a></br></br></br>



<c:forEach var="item" items="${itemsInCart}">
<tr>

    <td>Nazwa: ${item.drink.name}</td></br>
    <td>Ilość: ${item.amount}</td>
    <td>Cena: ${item.drink.price}</td></br>
    <a href="/delete/${item.id}">Delete</a></br></br></br>

</tr>
</c:forEach>

<a href="/buy">Buy</a>



</body>
</html>