<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/produit.css" />
<meta charset="UTF-8">
<title>Un produit</title>
</head>
<body>

	<div class="blocImage">
		<div class="photo">
			<img src="${produitDetail.url}" alt="${produitDetail.nom}"
				title="${produitDetail.nom}" class="imageProduit" /><br />
		</div>
		<div class="flexcontainer">
			<div class="textImage">
				<p>${produitDetail.nom}:</p>
			</div>
			<div class="prixProduit">
				<p>${produitDetail.prix}€</p>
			</div>
		</div>
	</div>
	<div class="retour-bloc">
		<div class="retour">
			<a href="produits">
				<button type="button" id="buttonRetour">Retour à la page
					produit</button>
			</a>
		</div>
	</div>


</body>
</html>