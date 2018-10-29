<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/produits.css" />
<meta charset="UTF-8">
<title>produit</title>
</head>
<body>
	<div>
		<c:forEach items="${tableauProduit}" var="produit" varStatus="valeurIndice">
			<div class="blocImage">
				<div class="imageProduitAlimentaire">
					<a
						href="produit?indice=${valeurIndice.index}"><img
						src="${produit.url}" alt="${produit.nom}"
						title="${produit.nom}" class="imageProduit" /></a>
				</div>
				<div class="textImage">
					<p>${produit.nom}</p>
				</div>
				<div class="prixProduit">
					<p>${produit.prix}€</p>
				</div>
			</div>

		</c:forEach>
	</div>

</body>
</html>