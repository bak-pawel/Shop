<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<form method="get" action="/drinks">
    <input name="drinkName"/>
    <input type="submit" value="Search"/>
</form>
<a href="/logout">Wyloguj</a></br>

<a href="/cart">Cart</a></br></br>

<c:forEach var="drink" items="${drinks}">
    <tr>

        <td>Nazwa: ${drink.name}</td></br>
        <td>Pojemność: ${drink.volume}</td>
        <td>Cena: ${drink.price}</td>
        <td>Dostępność: ${drink.availability}</td></br>
        <td>Szt</td>
        <form method="get" action="/addtocart">
            <input name="availability"/>
                <input name="id" value="${drink.id}" hidden/>
            <input type="submit" value="add to cart"/></br></br></br>
        </form>

    </tr>
</c:forEach>

</body>
</html>