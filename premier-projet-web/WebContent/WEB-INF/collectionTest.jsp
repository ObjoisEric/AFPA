<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="fr.objois.bean.Pays"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/collectionTest.css" />
<meta charset="ISO-8859-1">
<title>Collection Test!</title>
</head>
<body>

<span> taille du tableau : ${tableauFood.size()}</span>

<ul>
	<c:forEach items="${tableauFood}" var="chaine" varStatus="indice">
		<li>${indice.index} : ${chaine}</li>
	</c:forEach>
</ul>



<br/>
<select>
	<c:forEach items="${listPays}" var="pays">
		<option value="${pays.codePays}">${pays.nomPays}</option>	
	</c:forEach>
</select>

</body>
</html>