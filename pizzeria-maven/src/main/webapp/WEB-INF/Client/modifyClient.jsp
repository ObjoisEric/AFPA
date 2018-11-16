<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifier CLient</title>
</head>
<body>
<form action="" method="post">
	<br/><label for="numeroClient">Numero Client : </label><input type="text" name="numeroClient" id="numeroClient" value="${clientDetail.numeroClient}" placeholder="${clientDetail.numeroClient}" />
	<br/><label for="nom">Nom : </label><input type="text" name="nom" id="nom" value="${clientDetail.nom}" placeholder="${clientDetail.nom}" />
	<br/><label for="prenom">Prenom : </label><input type="text" name="prenom" id="prenom" value="${clientDetail.prenom}" placeholder="${clientDetail.prenom}" />
	<br/><label for="adresse">Adresse : </label><input type="text" name="adresse" id="adresse" value="${clientDetail.adresse}" placeholder="${clientDetail.adresse}" />
	<br/><label for="telFixe">Telephone Fixe : </label><input type="text" name="telFixe" id="telFixe" value="${clientDetail.telFixe}" placeholder="${clientDetail.telFixe}" />
	<br/><label for="telPortable">Telephone Portable : </label><input type="text" name="telPortable" id="telPortable" value="${clientDetail.telPortable}" placeholder="${clientDetail.telPortable}" />
	<br/><label for="dateNaissance">Date de Naissance : </label><input type="text" name="dateNaissance" id="dateNaissance" value="${clientDetail.dateNaissance}" placeholder="${clientDetail.dateNaissance}" />
	<br/><label for="email">Email : </label><input type="text" name="email" id="email" value="${clientDetail.email}" placeholder="${clientDetail.email}" />
	<input type="text" name="id" id="id" value="${clientDetail.id}" placeholder="${clientDetail.id}" hidden="hidden" />
	<br/><input type="submit" value="Modifier"/>
</form>

<br/>
<a href="clients">Retour à l'acceuil</a>


</body>
</html>