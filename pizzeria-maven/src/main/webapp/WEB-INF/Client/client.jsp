<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client</title>
</head>
<body>
<p>Numero Client : ${clientDetail.numeroClient}</p>
<p>Nom : ${clientDetail.nom}</p>
<p>Prenom : ${clientDetail.prenom}</p>
<p>Adresse : ${clientDetail.adresse}</p>
<p>Telephone Fixe : ${clientDetail.telFixe}</p>
<p>Telephone Portable : ${clientDetail.telPortable}</p>
<p>Date de Naissance : ${clientDetail.dateNaissance}</p>
<p>Email: ${clientDetail.email}</p>
<br/>
<a href="clients">Retour à l'acceuil</a>
</body>
</html>