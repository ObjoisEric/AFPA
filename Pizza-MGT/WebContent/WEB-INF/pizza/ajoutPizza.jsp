<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressource/CSS/ajoutPizza.css" />
<meta charset="ISO-8859-1">
<title>Ajout de pizza</title>
</head>
<body>
	<div class="formAjout">
		<form action="ajoutPizza" method="post">
			<label for="libelle">libelle : </label><br />
			<input type="text" name="libelle" id="libelle" placeholder="libelle" /><br />
			<label for="reference">reference : </label><br />
			<input type="text" name="reference" id="reference"
				placeholder="reference" /><br /> <label for="prix">prix : </label><br />
			<input type="text" name="prix" id="prix" placeholder="prix" /><br />
			<label for="urlImage">urlImage : </label><br />
			<input type="text" name="urlImage" id="urlImage"
				placeholder="url Image" /><br /> <input type="submit"
				value="Ajouter" />
		</form>
	</div>




</body>
</html>