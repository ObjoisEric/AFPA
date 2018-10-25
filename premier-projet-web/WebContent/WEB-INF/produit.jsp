<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="fr.objois.bean.Produit"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/acceuil.css" />
<meta charset="utf-8">
<title>produit</title>
</head>
<body>
	<h2>produits</h2>
	<ol id="olProduit">
		<li>PC</li>
		<li>tablette</li>
		<li>clavier</li>
		<li>écran</li>
	</ol>
	<br />
	<caption>produit :</caption>
	<div id="div-tab">
		<table id="tableProduit">
			<tr>
				<th id="thVoid"></th>
				<th>type</th>
				<th>marque</th>
				<th>prix</th>
			</tr>
			<tr>
				<td>1er entrée</td>
				<td>PC</td>
				<td>Samsung</td>
				<td>500</td>
			</tr>
			<tr>
				<td>2ème entrée</td>
				<td>tablette</td>
				<td>apple</td>
				<td>500</td>
			</tr>
			<tr>
				<td>3ème entrée</td>
				<td>clavier</td>
				<td>logitech</td>
				<td>150</td>
			</tr>
			<tr>
				<td>4ème entrée</td>
				<td>ecran</td>
				<td>dell</td>
				<td>250</td>
			</tr>
		</table>
	</div>

	<% 
    //permet de formater un type Double
    DecimalFormat df = new DecimalFormat("#0.00");
    
    
    // recuperation des différents objets envoyés
    String produitPomme = (String) request.getAttribute("nomPomme");   
    String nomProduit[] = (String[]) request.getAttribute("tableauNomProduit");
    Double prixProduit[] = (Double[]) request.getAttribute("tableauPrixProduit");
    String urlProduit[] = (String[]) request.getAttribute("tableauUrlProduit");
    Produit produitObjet[] = (Produit[]) request.getAttribute("tableauProduitObjet");
    
    %>

	<div>
		<!-- traitement via boucle for avec multiple tableau -->
		<%	for (int i = 0 ; i < nomProduit.length; i++) {
    		%><div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="<%= urlProduit[i] %>" alt="<%= nomProduit[i] %>"
					title="<%= nomProduit[i] %>" class="imageProduit" />
			</div>
			<div class="textImage">
				<p><%= nomProduit[i] %></p>
			</div>
			<div class="prixProduit">
				<p><%= df.format(prixProduit[i]) + "€"  %></p>
			</div>
		</div>
		<%
    	}    	
    	%>

		<!-- traitement via boucle for avec un tableau d'objet -->
		<%	for (int i = 0 ; i < produitObjet.length; i++) {
    		%><div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="<%= produitObjet[i].getUrlProduit() %>"
					alt="<%= produitObjet[i].getNomProduit() %>"
					title="<%= produitObjet[i].getNomProduit() %>" class="imageProduit" />
			</div>
			<div class="textImage">
				<p><%= produitObjet[i].getNomProduit() %></p>
			</div>
			<div class="prixProduit">
				<p><%= df.format(produitObjet[i].getPrixProduit()) + "€" %></p>
			</div>
		</div>
		<%
    	}    	
    	%>

		<!-- traitement via boucle for avec une liste + lien vers produit individuel -->
		<c:forEach items="${listProduit}" var="produit">
			<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<a href="produitIndividuel?nomDuProduit=${produit.nomProduit}&prixDuProduit=${produit.prixProduit}&urlDuProduit=${produit.urlProduit}"><img src="${produit.urlProduit}"
					alt="${produit.nomProduit}"
					title="${produit.nomProduit}" class="imageProduit" /></a>
			</div>
			<div class="textImage">
				<p>${produit.nomProduit}</p>
			</div>
			<div class="prixProduit">
				<p>${produit.prixProduit} €</p>
			</div>
		</div>

		</c:forEach>

<a href="produitIndividuel"></a>


		<!-- traitement sans boucle et sans tableau -->
		<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/pomme.jpg" alt="pomme" title="pomme"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p><%=produitPomme %></p>
			</div>
			<div class="prixProduit">
				<p>1.50€</p>
			</div>
		</div>
		<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/banane.jpg" alt="banane" title="banane"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p>banane</p>
			</div>
			<div class="prixProduit">
				<p>1.50€</p>
			</div>
		</div>
		<div class="blocImage">

			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/poire.jpg" alt="poire" title="poire"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p>poire</p>
			</div>
			<div class="prixProduit">
				<p>1.50€</p>
			</div>
		</div>
		<div class="blocImage">

			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images//grenade.jpg" alt="grenade"
					title="grenade" class="imageProduit" />
			</div>
			<div class="textImage">
				<p>grenade</p>
			</div>
			<div class="prixProduit">
				<p>1.50€</p>
			</div>
		</div>
		<div class="blocImage">

			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/kiwi.jpg" alt="kiwi" title="kiwi"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p>kiwi</p>
			</div>
			<div class="prixProduit">
				<p>1.00€</p>
			</div>
		</div>
		<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/orange.jpg" alt="orange" title="orange"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p>orange</p>
			</div>
			<div class="prixProduit">
				<p>1.40€</p>
			</div>
		</div>
		<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/ananas.jpg" alt="ananas" title="ananas"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p>ananas</p>
			</div>
			<div class="prixProduit">
				<p>2.00€</p>
			</div>
		</div>
		<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/tomate.jpg" alt="tomate" title="tomate"
					class="imageProduit" />
			</div>
			<div class="textImage">
				<p>tomate</p>
			</div>
			<div class="prixProduit">
				<p>1.10€</p>
			</div>
		</div>
		<div class="blocImage">
			<div class="imageProduitAlimentaire">
				<img src="Ressources/Images/noixDeCoco.jpg" alt="noix de coco"
					title="noix de coco" class="imageProduit" />
			</div>
			<div class="textImage">
				<p>noix de coco</p>
			</div>
			<div class="prixProduit">
				<p>1.80€</p>
			</div>
		</div>
	</div>

	<div id="retour-bloc">
		<div id="retour">
			<a href="acceuil">
				<button type="button" id="buttonRetour">Retour à l'acceuil</button>
			</a>
		</div>
	</div>
</body>
</html>