<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/users.css" />
<meta charset="ISO-8859-1">
<title>Personne</title>
</head>
<body>
${timeCreationSession}
	<c:forEach items="${tableauPersonne}" var="personne" varStatus="valeurIndice">
		<div class="blocPhoto">
			<div class="imagePersonne">
				<a
					href="usersDetail?id=${valeurIndice.index}"><img
					src="${personne.urlPhoto}" alt="${personne.nom}"
					title="${personne.nom}" class="photo" /></a>
			</div>
			<div class="textPersonne">
				<p>${personne.nom} ${personne.prenom}</p>
			</div>
			
		</div>

	</c:forEach>


</body>
</html>
<!-- href="usersDetail?nomPersonne=${personne.nom}&prenomPersonne=${personne.prenom}&datePersonne=${personne.date}&numEtRuePersonne=${personne.numEtRue}
					&villePersonne=${personne.ville}&mailPersonne=${personne.mail}&telephonePersonne=${personne.telephone}&departementPersonne=${personne.departement}
					&paysPersonne=${personne.pays}&genrePersonne=${personne.genre}&urlPhotoPersonne=${personne.urlPhoto}" -->
