<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

<form method="get" action="/drinks">
    <input name="drinkName"/>
    <input type="submit" value="Search"/>
</form>

<c:forEach var="drink" items="${drink}">
<tr>

    <td>Nazwa: ${drink.name}</td></br>
    <td>Pojemność: ${drink.volume}</td>
    <td>Cena: ${drink.price}</td>
    <td>Dostępność: ${drink.quantity}</td></br>

    <td><a href="/drink/${drink}"></a></td>

</tr>
</c:forEach>

</body>
</html>