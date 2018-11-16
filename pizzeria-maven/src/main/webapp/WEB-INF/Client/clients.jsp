<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="Ressource/CSS/clients.css" />
<meta charset="ISO-8859-1">
<title>Clients</title>
</head>
<body>
	<table>
		<tr>
			<th>Numero Client</th>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Adresse</th>
			<th>Tel. Fixe</th>
			<th>Tel. Portable</th>
			<th>Date Naissance</th>
			<th>Email</th>
		</tr>
		<form action="modifyClient" method="post" id="formulaire">
			<c:forEach items="${listeClient}" var="client" varStatus="ligne">
				<tr>
					<%-- 				<td>${client.numeroClient}</td> --%>
					<%-- 				<td>${client.nom}</td> --%>
					<%-- 				<td>${client.prenom}</td> --%>
					<%-- 				<td>${client.adresse}</td> --%>
					<%-- 				<td>${client.telFixe}</td> --%>
					<%-- 				<td>${client.telPortable}</td> --%>
					<%-- 				<td>${client.dateNaissance}</td> --%>
					<%-- 				<td>${client.email}</td> --%>
					<td><input type="text" name="numeroClient" id="numeroClient"
						value="${client.numeroClient}" disabled="disabled"
						class="ligne-${ligne.index}  info" /></td>
					<td><input type="text" name="nom" id="nom"
						value="${client.nom}" disabled="disabled"
						class="ligne-${ligne.index} info" /></td>
					<td><input type="text" name="prenom" id="prenom"
						value="${client.prenom}" disabled="disabled"
						class="ligne-${ligne.index}  info" /></td>
					<td><input type="text" name="adresse" id="adresse"
						value="${client.adresse}" disabled="disabled"
						class="ligne-${ligne.index}  info" /></td>
					<td><input type="text" name="telFixe" id="telFixe"
						value="${client.telFixe}" disabled="disabled"
						class="ligne-${ligne.index}  info" /></td>
					<td><input type="text" name="telPortable" id="telPortable"
						value="${client.telPortable}" disabled="disabled"
						class="ligne-${ligne.index}  info" /></td>
					<td><input type="text" name="dateNaissance" id="dateNaissance"
						value="${client.dateNaissance}" disabled="disabled"
						class="ligne-${ligne.index}  info" /></td>
					<td><input type="text" name="email" id="email"
						value="${client.email}" disabled="disabled"
						class="ligne-${ligne.index} info" /></td>
					<input type="text" name="id" id="id" value="${client.id}"
						disabled="disabled" class="ligne-${ligne.index} info id"
						hidden="hidden" />

					<td><a href="client?id=${client.id}">Détail</a></td>
					<td><a href="modifyClient?id=${client.id}">Modifier</a></td>
					<td><input type="button" onclick="modifierClient(this)"
						value="+" class="ligne-${ligne.index} bouton" /> <input
						type="button" value="reset" class="ligne-${ligne.index} reset"
						hidden="hidden" onclick="resetLigne(this)" /></td>


				</tr>
			</c:forEach>
		</form>
		<form action="ajoutClient" method="post" id="ajoutClient">
			<tr id="ligneAjoutClient" hidden="hidden">

				<td><input type="text" name="numeroClient" id="numeroClient"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="nom" id="nom" disabled="disabled"
					class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="prenom" id="prenom"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="adresse" id="adresse"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="telFixe" id="telFixe"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="telPortable FieldEmpty" id="telPortable"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="dateNaissance" id="dateNaissance"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="text" name="email" id="email"
					disabled="disabled" class="formAjout FieldEmpty" /></td>
				<td><input type="button" value="Ajouter" class="formAjout"
					id="envoyerAjoutClient" onclick="verifForm(this)" /> 
					<input type="button" value="reset" class="formAjout reset" hidden="hidden"
					onclick="resetAjoutForm(this)" /></td>

			</tr>
		</form>
	</table>
	<input type="button" value="+" onclick="ajoutClient(this)"
		id="boutonAjoutClient" />

	<script src="Ressource/Js/clients.js"></script>
</body>
</html>