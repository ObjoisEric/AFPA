<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/testJSTL2.css" />
<meta charset="ISO-8859-1">
<title>testJSTL2</title>
</head>
<body>

	<form action="testJSTL2" method="get">
		<input type="text" name="ligne" id="ligne" placeholder="nbr ligne" />
		<br /><br /> 
		<input type="text" name="colonne" id="colonne" placeholder="nbr colonne" /> 
		<br /><br /> 
		<input type="text" name="etoile" id="etoile" placeholder="etoile" /> 
		<br /><br /> 
		<input type="submit">
	</form>



<br />
	<div>
		<a href="testJSTL2"> <input type="button" name="recharger"
			id="recharger" value="Random">
		</a>
	</div>


	
	<br />
	<br />
	<c:set var="index" value="1" />
	<table>
		<c:forEach begin="1" end="${ligne}">
			<tr>
				<c:forEach begin="1" end="${colonne}">
					<c:choose>
						<c:when test="${(index mod etoile) ne 0 }">
							<td>${index}</td>
						</c:when>
						<c:otherwise>

							<td>*</td>
						</c:otherwise>
					</c:choose>
					<c:set var="index" value="${index + 1}" />
				</c:forEach>
			</tr>
		</c:forEach>
	</table>

</body>
</html>