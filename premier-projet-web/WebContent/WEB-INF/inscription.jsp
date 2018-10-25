<%@page import="fr.objois.bean.Pays"%>
<%@page import="fr.objois.bean.Departement"%>
<%@page import="fr.objois.bean.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/Css/inscription.css" />
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>

<%
	Personne p = (Personne) request.getAttribute("valeurParDefaut");
	Departement[] departement = (Departement[]) request.getAttribute("tableauObjetDepartement");
	Pays[] pays = (Pays[]) request.getAttribute("tableauObjetPays");



%>
    <div id="blocFormulaire">
        <form action="">
            <fieldset>
                <legend>Vos Coordonées :</legend>
                <div class="blocValeur">
                    <label for="Mme">
                        Mme
                    </label>
                    <input type="radio" name="genre" value="Mme" id="Mme" <% if("Mme"== p.getGenre()){%>checked<% } %> >
                    <label for="Mr">
                        Mr
                    </label>
                    <input type="radio" name="genre" value="Mr" id="Mr" <% if("Mr"== p.getGenre()){%>checked<% } %>>
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="nom">
                        Nom :
                    </label>
                    <br />
                    <input type="text" name="nom" id="nom" maxlength="40" placeholder="Nom" value="<%= p.getNom()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="prenom">
                        Prénom :
                    </label>
                    <br />
                    <input type="text" name="prenom" id="prenom" maxlength="40" placeholder="Prénom" value="<%= p.getPrenom()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="dateNaissance">
                        Date :
                    </label>
                    <br />
                    <input type="date" name="dateNaissance" id="dateNaissance" placeholder="date" value="<%= p.getDate()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="numEtRue">
                        N° et rue :
                    </label>
                    <br />
                    <input type="text" name="numEtRue" id="numEtRue" placeholder="N° et Rue" value="<%= p.getNumEtRue()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="ville">
                        Ville :
                    </label>
                    <br />
                    <input type="text" name="ville" id="ville" maxlength="40" placeholder="Ville" value="<%= p.getVille()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="departement">
                        Département :
                    </label>
                    <br />

                    <select name="departement" id="departement" >
                    <% for(int i = 0 ; i < departement.length ; i++) {                     
                    %> 
                    	<option value="<%= departement[i].getNumDepartement() %>" 
                    	<% if (departement[i].getNumDepartement() == p.getDepartement()) { 
                    	%>selected="selected"<%                    	
                    	}
                    	%> >
                    	<%= departement[i].getNomDepartement() %>
                    	</option>                
                    
                    <% 
                    	} 
                    %>

                        
                    </select>
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="pays">
                        Pays :
                    </label>
                    <br />
                    <select name="pays" id="pays">
                    <% for(int j = 0 ; j < pays.length ; j++) {                     
                    %> 
                    	<option value="<%= pays[j].getCodePays() %>" 
                    	<% if (pays[j].getCodePays() == p.getPays()) { 
                    	%>selected="selected"<%                    	
                    	}
                    	%> >
                    	<%= pays[j].getNomPays() %>
                    	</option>                
                    
                    <% 
                    	} 
                    %>
                        
                    </select>
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="mail">
                        Mail :
                    </label>
                    <br />
                    <input type="text" name="mail" id="mail" placeholder="adressemail@adresse.com" value="<%= p.getMail()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="tel">
                        Téléphone :
                    </label>
                    <br />
                    <input type="text" name="telephone" id="telephone" maxlength="10" placeholder="0123456789" value="<%= p.getTelephone()%>">
                    <br />
                </div>
                <div class="blocValeur">
                    <label for="commentaires">
                        Vos commentaires :
                    </label>
                    <br />
                    <textarea name="commentaires" rows="4" cols="50%">
                    </textarea>
                    <br />
                </div>
            </fieldset>
            <div id="blocButton">
                <button type="submit" id="buttonEnvoyer" >Envoyer</button>
                <input type="reset" value="Annuler!">
                <button type="button" onclick="validationFormulaire()">Test formulaire !</button>
            </div>
        </form>
    </div>


<script src="Ressources/Js/inscription.js" ></script>
</body>
</html>