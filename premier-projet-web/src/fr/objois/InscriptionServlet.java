package fr.objois;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Departement;
import fr.objois.bean.Pays;
import fr.objois.bean.Personne;


/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int indexDepartement = 0;
		int indexPays = 0;
		Personne p = new Personne();
		Departement[] tableauDepartement = new Departement[103];
		Pays[] tableauPays = new Pays[193];
		
		tableauDepartement[indexDepartement++] = new Departement("00","(00) Hors France");
        tableauDepartement[indexDepartement++] = new Departement("01","(01) Ain");
        tableauDepartement[indexDepartement++] = new Departement("02","(02) Aisne");
        tableauDepartement[indexDepartement++] = new Departement("03","(03) Allier");
        tableauDepartement[indexDepartement++] = new Departement("04","(04) Alpes de Haute Provence");
        tableauDepartement[indexDepartement++] = new Departement("05","(05) Hautes Alpes");
        tableauDepartement[indexDepartement++] = new Departement("06","(06) Alpes Maritimes");
        tableauDepartement[indexDepartement++] = new Departement("07","(07) Ardèche");
        tableauDepartement[indexDepartement++] = new Departement("08","(08) Ardennes");
        tableauDepartement[indexDepartement++] = new Departement("09","(09) Ariège");
        tableauDepartement[indexDepartement++] = new Departement("10","(10) Aube");
        tableauDepartement[indexDepartement++] = new Departement("11","(11) Aude");
        tableauDepartement[indexDepartement++] = new Departement("12","(12) Aveyron");
        tableauDepartement[indexDepartement++] = new Departement("13","(13) Bouches du Rhône");
        tableauDepartement[indexDepartement++] = new Departement("14","(14) Calvados");
        tableauDepartement[indexDepartement++] = new Departement("15","(15) Cantal");
        tableauDepartement[indexDepartement++] = new Departement("16","(16) Charente");
        tableauDepartement[indexDepartement++] = new Departement("17","(17) Charente Maritime");
        tableauDepartement[indexDepartement++] = new Departement("18","(18) Cher");
        tableauDepartement[indexDepartement++] = new Departement("19","(19) Corrèze");
        tableauDepartement[indexDepartement++] = new Departement("2A","(2A) Corse du Sud");
        tableauDepartement[indexDepartement++] = new Departement("2B","(2B) Haute-Corse");
        tableauDepartement[indexDepartement++] = new Departement("21","(21) Côte d'Or");
        tableauDepartement[indexDepartement++] = new Departement("22","(22) Côtes d'Armor");
        tableauDepartement[indexDepartement++] = new Departement("23","(23) Creuse");
        tableauDepartement[indexDepartement++] = new Departement("24","(24) Dordogne");
        tableauDepartement[indexDepartement++] = new Departement("25","(25) Doubs");
        tableauDepartement[indexDepartement++] = new Departement("26","(26) Drôme");
        tableauDepartement[indexDepartement++] = new Departement("27","(27) Eure");
        tableauDepartement[indexDepartement++] = new Departement("28","(28) Eure et Loir");
        tableauDepartement[indexDepartement++] = new Departement("29","(29) Finistère");
        tableauDepartement[indexDepartement++] = new Departement("30","(30) Gard");
        tableauDepartement[indexDepartement++] = new Departement("31","(31) Haute Garonne");
        tableauDepartement[indexDepartement++] = new Departement("32","(32) Gers");
        tableauDepartement[indexDepartement++] = new Departement("33","(33) Gironde");
        tableauDepartement[indexDepartement++] = new Departement("34","(34) Hérault");
        tableauDepartement[indexDepartement++] = new Departement("35","(35) Ille et Vilaine");
        tableauDepartement[indexDepartement++] = new Departement("36","(36) Indre");
        tableauDepartement[indexDepartement++] = new Departement("37","(37) Indre et Loire");
        tableauDepartement[indexDepartement++] = new Departement("38","(38) Isère");
        tableauDepartement[indexDepartement++] = new Departement("39","(39) Jura");
        tableauDepartement[indexDepartement++] = new Departement("40","(40) Landes");
        tableauDepartement[indexDepartement++] = new Departement("41","(41) Loir et Cher");
        tableauDepartement[indexDepartement++] = new Departement("42","(42) Loire");
        tableauDepartement[indexDepartement++] = new Departement("43","(43) Haute Loire");
        tableauDepartement[indexDepartement++] = new Departement("44","(44) Loire Atlantique");
        tableauDepartement[indexDepartement++] = new Departement("45","(45) Loiret");
        tableauDepartement[indexDepartement++] = new Departement("46","(46) Lot");
        tableauDepartement[indexDepartement++] = new Departement("47","(47) Lot et Garonne");
        tableauDepartement[indexDepartement++] = new Departement("48","(48) Lozère");
        tableauDepartement[indexDepartement++] = new Departement("49","(49) Maine et Loire");
        tableauDepartement[indexDepartement++] = new Departement("50","(50) Manche");
        tableauDepartement[indexDepartement++] = new Departement("51","(51) Marne");
        tableauDepartement[indexDepartement++] = new Departement("52","(52) Haute Marne");
        tableauDepartement[indexDepartement++] = new Departement("53","(53) Mayenne");
        tableauDepartement[indexDepartement++] = new Departement("54","(54) Meurthe et Moselle");
        tableauDepartement[indexDepartement++] = new Departement("55","(55) Meuse");
        tableauDepartement[indexDepartement++] = new Departement("56","(56) Morbihan");
        tableauDepartement[indexDepartement++] = new Departement("57","(57) Moselle");
        tableauDepartement[indexDepartement++] = new Departement("58","(58) Nièvre");
        tableauDepartement[indexDepartement++] = new Departement("59","(59) Nord");
        tableauDepartement[indexDepartement++] = new Departement("60","(60) Oise");
        tableauDepartement[indexDepartement++] = new Departement("61","(61) Orne");
        tableauDepartement[indexDepartement++] = new Departement("62","(62) Pas de Calais");
        tableauDepartement[indexDepartement++] = new Departement("63","(63) Puy de Dôme");
        tableauDepartement[indexDepartement++] = new Departement("64","(64) Pyrénées Atlantiques");
        tableauDepartement[indexDepartement++] = new Departement("65","(65) Hautes Pyrénées");
        tableauDepartement[indexDepartement++] = new Departement("66","(66) Pyrénées Orientales");
        tableauDepartement[indexDepartement++] = new Departement("67","(67) Bas Rhin");
        tableauDepartement[indexDepartement++] = new Departement("68","(68) Haut Rhin");
        tableauDepartement[indexDepartement++] = new Departement("69","(69) Rhône");
        tableauDepartement[indexDepartement++] = new Departement("70","(70) Haute Saône");
        tableauDepartement[indexDepartement++] = new Departement("71","(71) Saône et Loire");
        tableauDepartement[indexDepartement++] = new Departement("72","(72) Sarthe");
        tableauDepartement[indexDepartement++] = new Departement("73","(73) Savoie");
        tableauDepartement[indexDepartement++] = new Departement("74","(74) Haute Savoie");
        tableauDepartement[indexDepartement++] = new Departement("75","(75) Paris");
        tableauDepartement[indexDepartement++] = new Departement("76","(76) Seine Maritime");
        tableauDepartement[indexDepartement++] = new Departement("77","(77) Seine et Marne");
        tableauDepartement[indexDepartement++] = new Departement("78","(78) Yvelines");
        tableauDepartement[indexDepartement++] = new Departement("79","(79) Deux Sèvres");
        tableauDepartement[indexDepartement++] = new Departement("80","(80) Somme");
        tableauDepartement[indexDepartement++] = new Departement("81","(81) Tarn");
        tableauDepartement[indexDepartement++] = new Departement("82","(82) Tarn et Garonne");
        tableauDepartement[indexDepartement++] = new Departement("83","(83) Var");
        tableauDepartement[indexDepartement++] = new Departement("84","(84) Vaucluse");
        tableauDepartement[indexDepartement++] = new Departement("85","(85) Vendée");
        tableauDepartement[indexDepartement++] = new Departement("86","(86) Vienne");
        tableauDepartement[indexDepartement++] = new Departement("87","(87) Haute Vienne");
        tableauDepartement[indexDepartement++] = new Departement("88","(88) Vosges");
        tableauDepartement[indexDepartement++] = new Departement("89","(89) Yonne");
        tableauDepartement[indexDepartement++] = new Departement("90","(90) Territoire de Belfort");
        tableauDepartement[indexDepartement++] = new Departement("91","(91) Essonne");
        tableauDepartement[indexDepartement++] = new Departement("92","(92) Hauts de Seine");
        tableauDepartement[indexDepartement++] = new Departement("93","(93) Seine Saint Denis");
        tableauDepartement[indexDepartement++] = new Departement("94","(94) Val de Marne");
        tableauDepartement[indexDepartement++] = new Departement("95","(95) Val d'Oise");
        tableauDepartement[indexDepartement++] = new Departement("971","(971) Guadeloupe");
        tableauDepartement[indexDepartement++] = new Departement("972","(972) Martinique");
        tableauDepartement[indexDepartement++] = new Departement("973","(973) Guyane");
        tableauDepartement[indexDepartement++] = new Departement("974","(974) Réunion");
        tableauDepartement[indexDepartement++] = new Departement("975","(975) Saint Pierre et Miquelon");
        tableauDepartement[indexDepartement++] = new Departement("976","(976) Mayotte");
		
        tableauPays[indexPays++] = new Pays("Afghanistan","Afghanistan");
        tableauPays[indexPays++] = new Pays("Afrique_du_Sud","Afrique du Sud");
        tableauPays[indexPays++] = new Pays("Albanie","Albanie");
        tableauPays[indexPays++] = new Pays("Algerie","Algérie");
        tableauPays[indexPays++] = new Pays("Allemagne","Allemagne");
        tableauPays[indexPays++] = new Pays("Andorre","Andorre");
        tableauPays[indexPays++] = new Pays("Angola","Angola");
        tableauPays[indexPays++] = new Pays("Antigua-et-Barbuda","Antigua-et-Barbuda");
        tableauPays[indexPays++] = new Pays("Arabie_saoudite","Arabie saoudite");
        tableauPays[indexPays++] = new Pays("Argentine","Argentine");
        tableauPays[indexPays++] = new Pays("Armenie","Arménie");
        tableauPays[indexPays++] = new Pays("Australie","Australie");
        tableauPays[indexPays++] = new Pays("Autriche","Autriche");
        tableauPays[indexPays++] = new Pays("Azerbaidjan","Azerbaïdjan");
        tableauPays[indexPays++] = new Pays("Bahamas","Bahamas");
        tableauPays[indexPays++] = new Pays("Bahrein","Bahreïn");
        tableauPays[indexPays++] = new Pays("Bangladesh","Bangladesh");
        tableauPays[indexPays++] = new Pays("Barbade","Barbade");
        tableauPays[indexPays++] = new Pays("Belau","Belau");
        tableauPays[indexPays++] = new Pays("Belgique","Belgique");
        tableauPays[indexPays++] = new Pays("Belize","Belize");
        tableauPays[indexPays++] = new Pays("Benin","Bénin");
        tableauPays[indexPays++] = new Pays("Bhoutan","Bhoutan");
        tableauPays[indexPays++] = new Pays("Bielorussie","Biélorussie");
        tableauPays[indexPays++] = new Pays("Birmanie","Birmanie");
        tableauPays[indexPays++] = new Pays("Bolivie","Bolivie");
        tableauPays[indexPays++] = new Pays("Bosnie-Herzégovine","Bosnie-Herzégovine");
        tableauPays[indexPays++] = new Pays("Botswana","Botswana");
        tableauPays[indexPays++] = new Pays("Bresil","Brésil");
        tableauPays[indexPays++] = new Pays("Brunei","Brunei");
        tableauPays[indexPays++] = new Pays("Bulgarie","Bulgarie");
        tableauPays[indexPays++] = new Pays("Burkina","Burkina");
        tableauPays[indexPays++] = new Pays("Burundi","Burundi");
        tableauPays[indexPays++] = new Pays("Cambodge","Cambodge");
        tableauPays[indexPays++] = new Pays("Cameroun","Cameroun");
        tableauPays[indexPays++] = new Pays("Canada","Canada");
        tableauPays[indexPays++] = new Pays("Cap-Vert","Cap-Vert");
        tableauPays[indexPays++] = new Pays("Chili","Chili");
        tableauPays[indexPays++] = new Pays("Chine","Chine");
        tableauPays[indexPays++] = new Pays("Chypre","Chypre");
        tableauPays[indexPays++] = new Pays("Colombie","Colombie");
        tableauPays[indexPays++] = new Pays("Comores","Comores");
        tableauPays[indexPays++] = new Pays("Congo","Congo");
        tableauPays[indexPays++] = new Pays("Cook","Cook");
        tableauPays[indexPays++] = new Pays("Coree_du_Nord","Corée du Nord");
        tableauPays[indexPays++] = new Pays("Coree_du_Sud","Corée du Sud");
        tableauPays[indexPays++] = new Pays("Costa_Rica","Costa Rica");
        tableauPays[indexPays++] = new Pays("Cote_Ivoire","Côte d'Ivoire");
        tableauPays[indexPays++] = new Pays("Croatie","Croatie");
        tableauPays[indexPays++] = new Pays("Cuba","Cuba");
        tableauPays[indexPays++] = new Pays("Danemark","Danemark");
        tableauPays[indexPays++] = new Pays("Djibouti","Djibouti");
        tableauPays[indexPays++] = new Pays("Dominique","Dominique");
        tableauPays[indexPays++] = new Pays("Egypte","Égypte");
        tableauPays[indexPays++] = new Pays("Emirats_arabes_unis","Émirats arabes unis");
        tableauPays[indexPays++] = new Pays("Equateur","Équateur");
        tableauPays[indexPays++] = new Pays("Erythree","Érythrée");
        tableauPays[indexPays++] = new Pays("Espagne","Espagne");
        tableauPays[indexPays++] = new Pays("Estonie","Estonie");
        tableauPays[indexPays++] = new Pays("Etats-Unis","États-Unis");
        tableauPays[indexPays++] = new Pays("Ethiopie","Éthiopie");
        tableauPays[indexPays++] = new Pays("Fidji","Fidji");
        tableauPays[indexPays++] = new Pays("Finlande","Finlande");
        tableauPays[indexPays++] = new Pays("France","France");
        tableauPays[indexPays++] = new Pays("Gabon","Gabon");
        tableauPays[indexPays++] = new Pays("Gambie","Gambie");
        tableauPays[indexPays++] = new Pays("Georgie","Géorgie");
        tableauPays[indexPays++] = new Pays("Ghana","Ghana");
        tableauPays[indexPays++] = new Pays("Grèce","Grèce");
        tableauPays[indexPays++] = new Pays("Grenade","Grenade");
        tableauPays[indexPays++] = new Pays("Guatemala","Guatemala");
        tableauPays[indexPays++] = new Pays("Guinee","Guinée");
        tableauPays[indexPays++] = new Pays("Guinee-Bissao","Guinée-Bissao");
        tableauPays[indexPays++] = new Pays("Guinee_equatoriale","Guinée équatoriale");
        tableauPays[indexPays++] = new Pays("Guyana","Guyana");
        tableauPays[indexPays++] = new Pays("Haiti","Haïti");
        tableauPays[indexPays++] = new Pays("Honduras","Honduras");
        tableauPays[indexPays++] = new Pays("Hongrie","Hongrie");
        tableauPays[indexPays++] = new Pays("Inde","Inde");
        tableauPays[indexPays++] = new Pays("Indonesie","Indonésie");
        tableauPays[indexPays++] = new Pays("Iran","Iran");
        tableauPays[indexPays++] = new Pays("Iraq","Iraq");
        tableauPays[indexPays++] = new Pays("Irlande","Irlande");
        tableauPays[indexPays++] = new Pays("Islande","Islande");
        tableauPays[indexPays++] = new Pays("Israël","Israël");
        tableauPays[indexPays++] = new Pays("Italie","Italie");
        tableauPays[indexPays++] = new Pays("Jamaique","Jamaïque");
        tableauPays[indexPays++] = new Pays("Japon","Japon");
        tableauPays[indexPays++] = new Pays("Jordanie","Jordanie");
        tableauPays[indexPays++] = new Pays("Kazakhstan","Kazakhstan");
        tableauPays[indexPays++] = new Pays("Kenya","Kenya");
        tableauPays[indexPays++] = new Pays("Kirghizistan","Kirghizistan");
        tableauPays[indexPays++] = new Pays("Kiribati","Kiribati");
        tableauPays[indexPays++] = new Pays("Koweit","Koweït");
        tableauPays[indexPays++] = new Pays("Laos","Laos");
        tableauPays[indexPays++] = new Pays("Lesotho","Lesotho");
        tableauPays[indexPays++] = new Pays("Lettonie","Lettonie");
        tableauPays[indexPays++] = new Pays("Liban","Liban");
        tableauPays[indexPays++] = new Pays("Liberia","Liberia");
        tableauPays[indexPays++] = new Pays("Libye","Libye");
        tableauPays[indexPays++] = new Pays("Liechtenstein","Liechtenstein");
        tableauPays[indexPays++] = new Pays("Lituanie","Lituanie");
        tableauPays[indexPays++] = new Pays("Luxembourg","Luxembourg");
        tableauPays[indexPays++] = new Pays("Macedoine","Macédoine");
        tableauPays[indexPays++] = new Pays("Madagascar","Madagascar");
        tableauPays[indexPays++] = new Pays("Malaisie","Malaisie");
        tableauPays[indexPays++] = new Pays("Malawi","Malawi");
        tableauPays[indexPays++] = new Pays("Maldives","Maldives");
        tableauPays[indexPays++] = new Pays("Mali","Mali");
        tableauPays[indexPays++] = new Pays("Malte","Malte");
        tableauPays[indexPays++] = new Pays("Maroc","Maroc");
        tableauPays[indexPays++] = new Pays("Marshall","Marshall");
        tableauPays[indexPays++] = new Pays("Maurice","Maurice");
        tableauPays[indexPays++] = new Pays("Mauritanie","Mauritanie");
        tableauPays[indexPays++] = new Pays("Mexique","Mexique");
        tableauPays[indexPays++] = new Pays("Micronesie","Micronésie");
        tableauPays[indexPays++] = new Pays("Moldavie","Moldavie");
        tableauPays[indexPays++] = new Pays("Monaco","Monaco");
        tableauPays[indexPays++] = new Pays("Mongolie","Mongolie");
        tableauPays[indexPays++] = new Pays("Mozambique","Mozambique");
        tableauPays[indexPays++] = new Pays("Namibie","Namibie");
        tableauPays[indexPays++] = new Pays("Nauru","Nauru");
        tableauPays[indexPays++] = new Pays("Nepal","Népal");
        tableauPays[indexPays++] = new Pays("Nicaragua","Nicaragua");
        tableauPays[indexPays++] = new Pays("Niger","Niger");
        tableauPays[indexPays++] = new Pays("Nigeria","Nigeria");
        tableauPays[indexPays++] = new Pays("Niue","Niue");
        tableauPays[indexPays++] = new Pays("Norvège","Norvège");
        tableauPays[indexPays++] = new Pays("Nouvelle-Zelande","Nouvelle-Zélande");
        tableauPays[indexPays++] = new Pays("Oman","Oman");
        tableauPays[indexPays++] = new Pays("Ouganda","Ouganda");
        tableauPays[indexPays++] = new Pays("Ouzbekistan","Ouzbékistan");
        tableauPays[indexPays++] = new Pays("Pakistan","Pakistan");
        tableauPays[indexPays++] = new Pays("Panama","Panama");
        tableauPays[indexPays++] = new Pays("Papouasie-Nouvelle_Guinee","Papouasie - Nouvelle Guinée");
        tableauPays[indexPays++] = new Pays("Paraguay","Paraguay");
        tableauPays[indexPays++] = new Pays("Pays-Bas","Pays-Bas");
        tableauPays[indexPays++] = new Pays("Perou","Pérou");
        tableauPays[indexPays++] = new Pays("Philippines","Philippines");
        tableauPays[indexPays++] = new Pays("Pologne","Pologne");
        tableauPays[indexPays++] = new Pays("Portugal","Portugal");
        tableauPays[indexPays++] = new Pays("Qatar","Qatar");
        tableauPays[indexPays++] = new Pays("Republique_centrafricaine","République centrafricaine");
        tableauPays[indexPays++] = new Pays("Republique_dominicaine","République dominicaine");
        tableauPays[indexPays++] = new Pays("Republique_tcheque","République tchèque");
        tableauPays[indexPays++] = new Pays("Roumanie","Roumanie");
        tableauPays[indexPays++] = new Pays("Royaume-Uni","Royaume-Uni");
        tableauPays[indexPays++] = new Pays("Russie","Russie");
        tableauPays[indexPays++] = new Pays("Rwanda","Rwanda");
        tableauPays[indexPays++] = new Pays("Saint-Christophe-et-Nieves","Saint-Christophe-et-Niévès");
        tableauPays[indexPays++] = new Pays("Sainte-Lucie","Sainte-Lucie");
        tableauPays[indexPays++] = new Pays("Saint-Marin","Saint-Marin ");
        tableauPays[indexPays++] = new Pays("Saint-Siège","Saint-Siège, ou leVatican");
        tableauPays[indexPays++] = new Pays("Saint-Vincent-et-les_Grenadines","Saint-Vincent-et-les Grenadines");
        tableauPays[indexPays++] = new Pays("Salomon","Salomon");
        tableauPays[indexPays++] = new Pays("Salvador","Salvador");
        tableauPays[indexPays++] = new Pays("Samoa_occidentales","Samoa occidentales");
        tableauPays[indexPays++] = new Pays("Sao_Tome-et-Principe","Sao Tomé-et-Principe");
        tableauPays[indexPays++] = new Pays("Senegal","Sénégal");
        tableauPays[indexPays++] = new Pays("Seychelles","Seychelles");
        tableauPays[indexPays++] = new Pays("Sierra_Leone","Sierra Leone");
        tableauPays[indexPays++] = new Pays("Singapour","Singapour");
        tableauPays[indexPays++] = new Pays("Slovaquie","Slovaquie");
        tableauPays[indexPays++] = new Pays("Slovenie","Slovénie");
        tableauPays[indexPays++] = new Pays("Somalie","Somalie");
        tableauPays[indexPays++] = new Pays("Soudan","Soudan");
        tableauPays[indexPays++] = new Pays("Sri_Lanka","Sri Lanka");
        tableauPays[indexPays++] = new Pays("Sued","Suède");
        tableauPays[indexPays++] = new Pays("Suisse","Suisse");
        tableauPays[indexPays++] = new Pays("Suriname","Suriname");
        tableauPays[indexPays++] = new Pays("Swaziland","Swaziland");
        tableauPays[indexPays++] = new Pays("Syrie","Syrie");
        tableauPays[indexPays++] = new Pays("Tadjikistan","Tadjikistan");
        tableauPays[indexPays++] = new Pays("Tanzanie","Tanzanie");
        tableauPays[indexPays++] = new Pays("Tchad","Tchad");
        tableauPays[indexPays++] = new Pays("Thailande","Thaïlande");
        tableauPays[indexPays++] = new Pays("Togo","Togo");
        tableauPays[indexPays++] = new Pays("Tonga","Tonga");
        tableauPays[indexPays++] = new Pays("Trinite-et-Tobago","Trinité-et-Tobago");
        tableauPays[indexPays++] = new Pays("Tunisie","Tunisie");
        tableauPays[indexPays++] = new Pays("Turkmenistan","Turkménistan");
        tableauPays[indexPays++] = new Pays("Turquie","Turquie");
        tableauPays[indexPays++] = new Pays("Tuvalu","Tuvalu");
        tableauPays[indexPays++] = new Pays("Ukraine","Ukraine");
        tableauPays[indexPays++] = new Pays("Uruguay","Uruguay");
        tableauPays[indexPays++] = new Pays("Vanuatu","Vanuatu");
        tableauPays[indexPays++] = new Pays("Venezuela","Venezuela");
        tableauPays[indexPays++] = new Pays("Viet_Nam","Viêt Nam");
        tableauPays[indexPays++] = new Pays("Yemen","Yémen");
        tableauPays[indexPays++] = new Pays("Yougoslavie","Yougoslavie");
        tableauPays[indexPays++] = new Pays("Zaire","Zaïre");
        tableauPays[indexPays++] = new Pays("Zambie","Zambie");
        tableauPays[indexPays++] = new Pays("Zimbabwe","Zimbabwe");
		
				
		p.setNom("ananas");
		p.setPrenom("banane");
		p.setMail("banane.ananas@mail.mail");
		p.setNumEtRue("00 rue de la tomate");
		p.setTelephone("0123456789");
		p.setVille("Poire");
		p.setDate("0001-01-01");
		p.setGenre("Mr");
		p.setDepartement("22");
		p.setPays("Danemark");
		
		request.setAttribute("valeurParDefaut", p);
		request.setAttribute("tableauObjetDepartement", tableauDepartement);
		request.setAttribute("tableauObjetPays", tableauPays);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String nom = (String) request.getParameter("nom");
	    String prenom= (String) request.getParameter("prenom");
	    String date = (String) request.getParameter("dateNaissance");
	    String numEtRue = (String) request.getParameter("numEtRue");
	    String ville = (String) request.getParameter("ville");
	    String mail = (String) request.getParameter("mail");
	    String telephone = (String) request.getParameter("telephone");
	    String departement = (String) request.getParameter("departement");
	    String pays = (String) request.getParameter("pays");
	    String genre = (String) request.getParameter("genre");
	    String urlPhoto = (String) request.getParameter("");
		
	    String commentaires = (String) request.getParameter("commentaires");
		
		Personne nouveauUtilisateur = new Personne(nom, prenom, date, numEtRue, ville, mail, telephone, departement, pays, genre, urlPhoto);
		
		
		request.setAttribute("nouveauUtilisateur", nouveauUtilisateur);
		request.setAttribute("commentaires", commentaires);
		
		System.out.println("post !!!!!!");
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionOK.jsp").
		
	}

}
