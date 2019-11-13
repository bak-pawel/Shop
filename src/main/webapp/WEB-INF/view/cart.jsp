<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Twój koszyk: </h1>

<a href="/logout">Wyloguj</a>

<c:forEach var="drink" items="${drinks}">
    <tr>
        <td>Nazwa: ${drink.name}</td></br>
        <td>Pojemność: ${drink.volume}</td>
        <td>Cena: ${drink.price}</td>
        <td>Dostępność: ${drink.availability}</td></br>
        <td>Szt</td>
        <form method="get" action="/cart">
            <input name="availability"/>
            <input name="id" value="${drink.id}" hidden/>
            <input type="submit" value="Actuall"/>
        </form>

    </tr>
</c:forEach>




</body>
</html>