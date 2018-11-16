<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressource/CSS/pizzas.css" />
<meta charset="ISO-8859-1">
<title>Modification Pizza</title>
</head>
<body>
	<div class="formPizza">
		<form action="" method="post">
			<select name="libellePizzaValue" id="libellePizzaValue">
				<c:forEach items="${listePizza}" var="pizza">
					<option value="${pizza.id}"
						<c:if test="${libellePizzaValue == pizza.id}">selected="selected"</c:if>>
						${pizza.libelle}</option>
				</c:forEach>
			</select> <br />
			<input type="submit" value="Selectionner" />
		</form>
		<form action="pizzaAModifier" method="post">
			<br />
			<label for="libelle">libelle : </label><br />
			<input type="text" name="libelle" id="libelle"
				value="${pizza.libelle}"> <br />
			<label for="reference">reference :</label><br />
			<input type="text" name="reference" id="reference"
				value="${pizza.reference}"> <br />
			<label for="prix">prix : </label><br />
			<input type="text" name="prix" id="prix" value="${pizza.prix}">
			<br />
			<label for="urlImage">urlImage : </label><br />
			<input type="text" name="urlImage" id="urlImage"
				value="${pizza.urlImage}"> <br />
			<input type="text" hidden="hidden" name="id" id="id"
				value="${pizza.id}"> <br />
			<input type="submit" value="Modifier" />
		</form>
	</div>
	<div class="retour-bloc">
		<div class="retour">
			<a href="pizzas">
				<button type="button" class="buttonRetour" >Acceuil</button>
			</a>
		</div>
	</div>

</body>
</html>