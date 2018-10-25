<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="Ressources/Css/acceuil.css"/>
    <meta charset="utf-8"/>
    <title>Acceuil</title>
</head>
<body>
<div>
    <h1>Acceuil</h1></div>
<div id="barreAcceuil">
    <ul>
        <li class="ligneAcceuil">
            <a href="acceuil">
                Accueil
            </a>
        </li>
        <li class="ligneAcceuil">
            <a href="utilisateur">
                Utilisateur
            </a>
        </li>
        <li class="ligneAcceuil">
            <a href="produit">
                Produit
            </a>
        </li>
        <li class="ligneAcceuil">
            <a href="connexion">
                Connexion
            </a>
        </li>
    </ul>


</div>
<div>
    <a href="utilisateur">
        <img src="Ressources/Images/imagesUtilisateur.jpg" alt="image pour utilisateur" id="imageUtilisateur"
             title="utilisateur"/>
    </a>
</div>

<div>
    <a href="produit">
        <img src="Ressources/Images/imageProduit.jpg" alt="image pour produit" id="imageProduit"
             title="produit"/>
    </a>
</div>
<div>
    <form>
        <label for="date">date : </label>
        <span class="InputFormulaire">
                    <input type="date" name="date" id="date" placeholder="date"><br/>
                </span>
        <label for="color">color : </label>
        <span class="InputFormulaire">
                    <input type="color" name="color" id="color"><br/>
                </span>
        <label for="number">number : </label>
        <span class="InputFormulaire">
                    <input type="number" name="number" id="number" placeholder="number"><br/>
                </span>
        <label for="checkbox">checkbox : </label>
        <span class="InputFormulaire">
                    <input type="checkbox" name="checkbox" id="checkbox" placeholder="checkbox"><br/>
                </span>
        <label for="radio">radio : </label>
        <span class="InputFormulaire">
                    <input type="radio" name="radio" id="radio" placeholder="radio"><br/>
        </span>
    </form>
</div>

</body>
</html>