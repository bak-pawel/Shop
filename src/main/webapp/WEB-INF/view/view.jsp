<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<c:forEach var="drink" items="${drinks}">
<tr>
    <td>${drink.name}</td>
    <td><a href="/drink/${drink}"></a></td>

</tr>
</c:forEach>
</body>
</html>