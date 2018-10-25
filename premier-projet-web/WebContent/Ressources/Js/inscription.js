function enleverEspaces(phrase) {
    phrase = phrase.replace(/[\s]{2,}/g," "); // Enlève les espaces doubles, triples, etc.
    phrase = phrase.replace(/^[\s]/, ""); // Enlève les espaces au début
    phrase = phrase.replace(/[\s]$/,""); // Enlève les espaces à la fin
    return phrase;
}

function validationFormulaire() {
    var nom = document.getElementById("nom").value;
    nom = enleverEspaces(nom);
    var prenom = document.getElementById("prenom").value;
    prenom = enleverEspaces(prenom);
    var dateNaissance = document.getElementById("dateNaissance").value;
    var dateActuel = new Date();
    var dateNaissanceFormat = new Date(dateNaissance);
    var numEtRue = document.getElementById("numEtRue").value;
    numEtRue = enleverEspaces(numEtRue);
    var ville = document.getElementById("ville").value;
    ville = enleverEspaces(ville);
    var telephone = document.getElementById("telephone").value;
    telephone = telephone.replace(/ /g,"");
    var mail = document.getElementById("mail").value;
    mail = enleverEspaces(mail);
    var formulaireValide;
    console.log("Validation Formulaire");
    //verif nom
    if(nom !== "") {
        console.log(nom);
        document.getElementById("nom").classList.remove("erreurFormulaire");
    }else {
        console.log("erreur nom");
        document.getElementById("nom").classList.add("erreurFormulaire");
        formulaireValide = false;
    }
    //verif prenom
    if(prenom !== "") {
        console.log(prenom);
        document.getElementById("prenom").classList.remove("erreurFormulaire");
    }else {
        console.log("erreur prenom");
        document.getElementById("prenom").classList.add("erreurFormulaire");
        formulaireValide = false;
    }
    //verif date
    if (dateNaissanceFormat > dateActuel || dateNaissance ==="") {
        console.log("date invalide");
        document.getElementById("dateNaissance").classList.add("erreurFormulaire");
        formulaireValide = false;
    }else {
        console.log("date ok !");
        document.getElementById("dateNaissance").classList.remove("erreurFormulaire");
    }
    //verif numero et rue
    console.log(numEtRue);
    if (numEtRue === "") {
        console.log("numero et rue error");
        document.getElementById("numEtRue").classList.add("erreurFormulaire");
    }else {
        console.log("numero et rue ok !");
        document.getElementById("numEtRue").classList.remove("erreurFormulaire");
    }
    //verif ville
    if (ville === "") {
        console.log("ville error");
        document.getElementById("ville").classList.add("erreurFormulaire");
    }else {
        console.log("ville ok !");
        document.getElementById("ville").classList.remove("erreurFormulaire");
    }

    //verif mail
    if (mail === "") {
        console.log("error mail");
        document.getElementById("mail").classList.add("erreurFormulaire");
    } else {
        console.log("mail ok");
        document.getElementById("mail").classList.remove("erreurFormulaire");
    }
    //verif telephone
    console.log(telephone);
    console.log(telephone.length);

    if (telephone === "" || telephone.length < 10 || telephone.charAt(0) !== "0" ) {
        console.log("error tel");
        document.getElementById("telephone").classList.add("erreurFormulaire");
    }else {
        console.log("tel ok !");
        document.getElementById("telephone").classList.remove("erreurFormulaire");
    }

    if(formulaireValide === false) {
        console.log("erreur dans le formulaire");
    }else{
        console.log("formulaire OK !");
    }
}