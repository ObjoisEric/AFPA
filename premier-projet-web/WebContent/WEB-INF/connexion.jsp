<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="fr-fr" xmlns="http://www.w3.org/1999/xhtml">

<head>
    <link rel="stylesheet" href="Ressources/Css/acceuil.css"/>
    <meta charset="utf-8" />
    <title>connexion</title>
</head>

<body>
    <div>
        <h2>
            Connexion
        </h2>
    </div>
    <div>
        <p>Bonjour,
            <span class="votreNom">
                votreNom
            </span>,
            vous êtes bien connectés.
        </p>
    </div>

    <form method="POST" action="login">        
        <fieldset>
            <legend>Formulaire de connexion :</legend>
            <div>
                <label for="login">login : </label>
                <span class="InputFormulaire">
                    <input type="text" name="login" id="login" placeholder="login">
                </span>
            </div>
            <div>
            	<label for="password">password : </label>
                <span class="InputFormulaire">
                    <input type="password" name="password" id="password" placeholder="password"><br />
                </span>
            </div>
            <div>
                <input type="submit" id="submit"/>
            </div>
        </fieldset>
    </form>
    <div id="retour">
        <a href="acceuil">
            <button type="button" value="Retour à l'acceuil!">Retour à l'acceuil</button>
        </a>
    </div>
</body>

</html>