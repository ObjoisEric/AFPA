<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/usersDetail.css" />
<meta charset="ISO-8859-1">
<title>Users Detail</title>
</head>
<body>


	<div class="blocImage">
		<div class="photo">
			<img src="${p.urlPhoto}" alt="${p.nom}" title="${p.nom}" class="imageProduit" /><br />
		</div>
		<div  class="flexcontainer">
			<div class="textPersonne">
          		<span>${p.nom}</span>          		
    		</div>
    		<div class="textPersonne">
    			<span>${p.prenom}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.date}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.numEtRue}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.ville}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.mail}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.telephone}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.departement}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.pays}</span>
    		</div>
    		<div class="textPersonne">
          		<span>${p.genre}</span>          		
    		</div>
    		

    			
		</div>        
    </div>
    <div class="retour-bloc">
		<div class="retour">
			<a href="users">
				<button type="button" id="buttonRetour">Retour à la page users</button>
			</a>
		</div>
	</div>

</body>
</html>
