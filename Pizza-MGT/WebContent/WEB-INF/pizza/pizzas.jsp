<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressource/CSS/pizzas.css" />

<meta charset="ISO-8859-1">
<title>Plein de pizza</title>
</head>
<body>

	<h1>PIZZERIA !</h1>

	<div class="menu-bloc">
		<div class="menuLien">
			<button type="button" class="buttonLien"
				onclick="document.location.href = 'ajoutPizza';">Ajouter
				une Pizza</button>
			<button type="button" class="buttonLien"
				onclick="document.location.href = 'modifyPizza';">Modifier
				une Pizza</button>
			<button type="button" class="buttonLien"
				onclick="document.location.href = 'deletePizza';">Supprimer
				une Pizza</button>
			<button type="button" class="buttonLien"
				onclick="document.location.href = 'sortIDPizza';">Ranger
				les ID Pizza</button>
		</div>
	</div>

	<br />
	<br />


	<table>
		<tr>
			<th>id</th>
			<th>libelle</th>
			<th>reference</th>
			<th>prix</th>
			<th>urlImage</th>
		</tr>
		<c:forEach items="${listePizza}" var="pizza">
			<tr>
				<td>${pizza.id}</td>
				<td>${pizza.libelle}</td>
				<td>${pizza.reference}</td>
				<td>${pizza.prix}</td>
				<td>${pizza.urlImage}</td>
			</tr>

		</c:forEach>
	</table>



	<br />
	<a href="ajoutPizza">Ajouter une pizza</a>
	<br />
	<a href="modifyPizza">Modifier une pizza</a>
	<br />
	<a href="deletePizza">Supprimer une pizza</a>
	<br />
	<a href="sortIDPizza">RANGE les ID</a>



</body>
</html>