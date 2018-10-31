<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supprimer Une pizza</title>
</head>
<body>
<h1>Supprimer une pizza</h1>
<form action="pizzaASupprimer" method="post">
	<select name="pizzaID" id="pizzaID">
	<c:forEach items="${listePizza}" var="pizza">
		<option value="${pizza.id}">
			${pizza.libelle}
		</option>
	</c:forEach>	
	</select>
	<br/>
	<input type="submit" value="Supprimer"/> 
</form>

</body>
</html>