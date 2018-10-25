<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="fr-fr" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="Ressources/Css/acceuil.css"/>
    <meta charset="utf-8" />
    <title>Utilisateur</title>
</head>
<body>
    <h2>
        Bonjour 
    </h2>
    
    <c:out value="bonjour" />
    <br/>
    <c:set var="test" value="test de la variable"></c:set>
    <c:out value="${test}" />
    <br/>    
    <c:out value="${test}${loginSend}" />
    <br/>    
    <c:out value="${nombre1 + nombre2}" />
    <br/>
    <c:out value="${nombre1 - nombre2}" />
    <br/>
    <c:out value="${nombre1 * nombre2}" />
    <br/>
    <c:out value="${nombre1 / nombre2}" />
    <br/>
    <c:out value="${nombre1 > nombre2}" />
    <br/>
    <c:out value="${nombre1 gt nombre2}" />
    <br/>
    <c:out value="${nombre1 < nombre2}" />
    <br/>
    <c:out value="${nombre1 lt nombre2}" />
    <br/>
    <c:out value="${nombre1 == nombre2}" />
    <br/>
    <c:out value="${nombre1 eq nombre2}" />
    <br/>
    <c:out value="${nombre1 != nombre2}" />
    <br/>
    <c:out value="${nombre1 ne nombre2}" />
    <br/>
    <h1>${test}</h1>
    <h1>${testServ}</h1>
    <input type="text" name="login" id="login" maxlength="40" placeholder="login" value= "${loginSend}" />
    <br/>
    <input type="password" name="password" id="password" maxlength="40" placeholder="password" value= "${passwordSend}" />
    

    <ul id="ulUtilisateur">
        <li class="formUtilisateur">
            nom : 
        </li>
        <li>
            prenom : 
        </li>
        <li>
            date naissance : 
        </li>
    </ul>
    <br/>    
    <div id="retour">
        <a href="acceuil">
            <button type="button" value="Retour à l'acceuil!">Retour à l'acceuil</button>
        </a>
    </div>
</body>
</html>