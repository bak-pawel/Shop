<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<br>

<form method="get" action="/items">
    <input name="itemName"/>
    <input type="submit" value="Search"/>
</form>
<a href="/logout">Wyloguj</a></br>

<c:forEach var="item" items="${item}">
<tr>

    <td>Nazwa: ${item.name}</td></br>
    <td>Pojemność: ${item.volume}</td>
    <td>Cena: ${item.price}</td>
    <td>Dostępność: ${item.availability}</td></br>
    <td>Szt</td>
    <form method="get" action="/cart">
        <input name="availability"/>
        <input name="id" value="${item.id}" hidden/>
        <input type="submit" value="add to cart"/>
    </form>
</tr>
</c:forEach>

</body>
</html>