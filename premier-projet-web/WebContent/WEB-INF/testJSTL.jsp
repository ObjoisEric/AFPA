<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test JSTL</title>
</head>
<body>
	<c:if test="${bool}">
		<h1>le test fonctionne !</h1>
	</c:if>


	<c:forEach var="i" begin="1" end="${nombre1}">
		<c:choose>
			<c:when test="${i eq 5}">
				<h2>le chiffre ne s'affiche pas</h2>
			</c:when>
			<c:otherwise>
				<c:set var="valeur" value="${i}" />
				<h1>${i}</h1>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<br />
	<c:choose>
		<c:when test="${valeur gt nombre2}">
			<a>${valeur} est sup à ${nombre2}</a>
		</c:when>
		<c:when test="${valeur eq nombre2}">
			<a>${valeur} est egal à ${nombre2}</a>
		</c:when>
		<c:otherwise>
			<a>erreur</a>
		</c:otherwise>
	</c:choose>

	<br />
	<br />
	
	
	
	<c:set var="indexTable" value="0" />
	<table>
		<c:forEach var="ligne2" begin="1" end="3">
			<tr>
			<c:forEach var="colonne2" begin="1" end="5">
				<td>
					${indexTable = indexTable + 1}
				</td>
			</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
	<c:set var="index" value="0" scope="request" />
	<br/>
	<table>
	<c:forEach var="ligne" begin="1" end="${Math.ceil(nombreLimite / colonneMax)}">
		<tr>
		<c:forEach var="colonne" begin="1" end="${colonneMax}">
			<c:if test="${(index le nombreLimite-2)}">			
				
					<td>${index = index + 2}</td>
				
			</c:if>
		</c:forEach>		
		</tr>
	</c:forEach>
	</table>

	<br/>
	

</body>
</html>