<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/personne.css" />
<meta charset="ISO-8859-1">
<title>personne</title>
</head>
<body>
	<table>
		<tr>
			<th>nom</th>
			<th>prenom</th>
			<th>date Naissance</th>
			<th>telephone</th>
			<th>email</th>
		</tr>
		<c:forEach items="${listePersonnes}" var="personne">
			<tr>
				<td>${personne.nom}</td>
				<td>${personne.prenom}</td>
				<td>${personne.dateDeNaissance}</td>
				<td>${personne.phone}</td>
				<td>${personne.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>