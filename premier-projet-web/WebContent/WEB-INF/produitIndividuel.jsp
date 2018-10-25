<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/produitIndividuel.css" />
<meta charset="UTF-8">
<title>Un produit</title>
</head>
<body>
	
	<div class="blocImage">
		<div class="imageProduit">
			<img src="${produitAAfficher.urlProduit}" alt="${produitAAfficher.nomProduit}" title="${produitAAfficher.nomProduit}" class="imageProduit" /><br />
		</div>
		<div  class="flexcontainer">
			<div class="textImage">
          		<p>${produitAAfficher.nomProduit} : </p>
    		</div>
    		<div class="prixProduit">
          		<p>${produitAAfficher.prixProduit} €</p>
        	</div>			
		</div>        
    </div>
    <div class="retour-bloc">
		<div class="retour">
			<a href="produit">
				<button type="button" id="buttonRetour">Retour à la page produit</button>
			</a>
		</div>
	</div>
</body>
</html>