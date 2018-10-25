package fr.objois.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Pays;

/**
 * Servlet implementation class ConnexionTestServlet
 */
@WebServlet("/collectionTest")
public class CollectionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> tableauFood = new ArrayList<String>();
		
		tableauFood.add("tomate");
		tableauFood.add("banane");
		tableauFood.add("pomme");
		tableauFood.add("poire");
		tableauFood.add("ananas");
		tableauFood.add("kiwi");
		tableauFood.add("framboise");
		tableauFood.add("cerise");
		tableauFood.add("brocolis");
		tableauFood.add("datte");
		tableauFood.add("avocat");
		tableauFood.add("choux-fleur");
		tableauFood.add("endive");
		tableauFood.add("pomme de terre");
		tableauFood.add("grenade");
		tableauFood.add("figue");
		tableauFood.add("cassis");
		tableauFood.add("litchi");
		tableauFood.add("endive");
		
		
		
		ArrayList<Pays> listPays = new ArrayList<Pays>();
		

        listPays.add(new Pays("Afghanistan","Afghanistan"));
        listPays.add(new Pays("Afrique_du_Sud","Afrique du Sud"));
        listPays.add(new Pays("Albanie","Albanie"));
        listPays.add(new Pays("Algerie","Algérie"));
        listPays.add(new Pays("Allemagne","Allemagne"));
        listPays.add(new Pays("Andorre","Andorre"));
        listPays.add(new Pays("Angola","Angola"));
        listPays.add(new Pays("Antigua-et-Barbuda","Antigua-et-Barbuda"));
        listPays.add(new Pays("Arabie_saoudite","Arabie saoudite"));
        listPays.add(new Pays("Argentine","Argentine"));
        listPays.add(new Pays("Armenie","Arménie"));
        listPays.add(new Pays("Australie","Australie"));
        listPays.add(new Pays("Autriche","Autriche"));
        listPays.add(new Pays("Azerbaidjan","Azerbaïdjan"));
        listPays.add(new Pays("Bahamas","Bahamas"));
        listPays.add(new Pays("Bahrein","Bahreïn"));
        listPays.add(new Pays("Bangladesh","Bangladesh"));
        listPays.add(new Pays("Barbade","Barbade"));
        listPays.add(new Pays("Belau","Belau"));
        listPays.add(new Pays("Belgique","Belgique"));
        listPays.add(new Pays("Belize","Belize"));
        listPays.add(new Pays("Benin","Bénin"));
        listPays.add(new Pays("Bhoutan","Bhoutan"));
        listPays.add(new Pays("Bielorussie","Biélorussie"));
        listPays.add(new Pays("Birmanie","Birmanie"));
        listPays.add(new Pays("Bolivie","Bolivie"));
        listPays.add(new Pays("Bosnie-Herzégovine","Bosnie-Herzégovine"));
        listPays.add(new Pays("Botswana","Botswana"));
        listPays.add(new Pays("Bresil","Brésil"));
        listPays.add(new Pays("Brunei","Brunei"));
        listPays.add(new Pays("Bulgarie","Bulgarie"));
        listPays.add(new Pays("Burkina","Burkina"));
        listPays.add(new Pays("Burundi","Burundi"));
        listPays.add(new Pays("Cambodge","Cambodge"));
        listPays.add(new Pays("Cameroun","Cameroun"));
        listPays.add(new Pays("Canada","Canada"));
        listPays.add(new Pays("Cap-Vert","Cap-Vert"));
        listPays.add(new Pays("Chili","Chili"));
        listPays.add(new Pays("Chine","Chine"));
        listPays.add(new Pays("Chypre","Chypre"));
        listPays.add(new Pays("Colombie","Colombie"));
        listPays.add(new Pays("Comores","Comores"));
        listPays.add(new Pays("Congo","Congo"));
        listPays.add(new Pays("Cook","Cook"));
        listPays.add(new Pays("Coree_du_Nord","Corée du Nord"));
        listPays.add(new Pays("Coree_du_Sud","Corée du Sud"));
        listPays.add(new Pays("Costa_Rica","Costa Rica"));
        listPays.add(new Pays("Cote_Ivoire","Côte d'Ivoire"));
        listPays.add(new Pays("Croatie","Croatie"));
        listPays.add(new Pays("Cuba","Cuba"));
        listPays.add(new Pays("Danemark","Danemark"));
        listPays.add(new Pays("Djibouti","Djibouti"));
        listPays.add(new Pays("Dominique","Dominique"));
        listPays.add(new Pays("Egypte","Égypte"));
        listPays.add(new Pays("Emirats_arabes_unis","Émirats arabes unis"));
        listPays.add(new Pays("Equateur","Équateur"));
        listPays.add(new Pays("Erythree","Érythrée"));
        listPays.add(new Pays("Espagne","Espagne"));
        listPays.add(new Pays("Estonie","Estonie"));
        listPays.add(new Pays("Etats-Unis","États-Unis"));
        listPays.add(new Pays("Ethiopie","Éthiopie"));
        listPays.add(new Pays("Fidji","Fidji"));
        listPays.add(new Pays("Finlande","Finlande"));
        listPays.add(new Pays("France","France"));
        listPays.add(new Pays("Gabon","Gabon"));
        listPays.add(new Pays("Gambie","Gambie"));
        listPays.add(new Pays("Georgie","Géorgie"));
        listPays.add(new Pays("Ghana","Ghana"));
        listPays.add(new Pays("Grèce","Grèce"));
        listPays.add(new Pays("Grenade","Grenade"));
        listPays.add(new Pays("Guatemala","Guatemala"));
        listPays.add(new Pays("Guinee","Guinée"));
        listPays.add(new Pays("Guinee-Bissao","Guinée-Bissao"));
        listPays.add(new Pays("Guinee_equatoriale","Guinée équatoriale"));
        listPays.add(new Pays("Guyana","Guyana"));
        listPays.add(new Pays("Haiti","Haïti"));
        listPays.add(new Pays("Honduras","Honduras"));
        listPays.add(new Pays("Hongrie","Hongrie"));
        listPays.add(new Pays("Inde","Inde"));
        listPays.add(new Pays("Indonesie","Indonésie"));
        listPays.add(new Pays("Iran","Iran"));
        listPays.add(new Pays("Iraq","Iraq"));
        listPays.add(new Pays("Irlande","Irlande"));
        listPays.add(new Pays("Islande","Islande"));
        listPays.add(new Pays("Israël","Israël"));
        listPays.add(new Pays("Italie","Italie"));
        listPays.add(new Pays("Jamaique","Jamaïque"));
        listPays.add(new Pays("Japon","Japon"));
        listPays.add(new Pays("Jordanie","Jordanie"));
        listPays.add(new Pays("Kazakhstan","Kazakhstan"));
        listPays.add(new Pays("Kenya","Kenya"));
        listPays.add(new Pays("Kirghizistan","Kirghizistan"));
        listPays.add(new Pays("Kiribati","Kiribati"));
        listPays.add(new Pays("Koweit","Koweït"));
        listPays.add(new Pays("Laos","Laos"));
        listPays.add(new Pays("Lesotho","Lesotho"));
        listPays.add(new Pays("Lettonie","Lettonie"));
        listPays.add(new Pays("Liban","Liban"));
        listPays.add(new Pays("Liberia","Liberia"));
        listPays.add(new Pays("Libye","Libye"));
        listPays.add(new Pays("Liechtenstein","Liechtenstein"));
        listPays.add(new Pays("Lituanie","Lituanie"));
        listPays.add(new Pays("Luxembourg","Luxembourg"));
        listPays.add(new Pays("Macedoine","Macédoine"));
        listPays.add(new Pays("Madagascar","Madagascar"));
        listPays.add(new Pays("Malaisie","Malaisie"));
        listPays.add(new Pays("Malawi","Malawi"));
        listPays.add(new Pays("Maldives","Maldives"));
        listPays.add(new Pays("Mali","Mali"));
        listPays.add(new Pays("Malte","Malte"));
        listPays.add(new Pays("Maroc","Maroc"));
        listPays.add(new Pays("Marshall","Marshall"));
        listPays.add(new Pays("Maurice","Maurice"));
        listPays.add(new Pays("Mauritanie","Mauritanie"));
        listPays.add(new Pays("Mexique","Mexique"));
        listPays.add(new Pays("Micronesie","Micronésie"));
        listPays.add(new Pays("Moldavie","Moldavie"));
        listPays.add(new Pays("Monaco","Monaco"));
        listPays.add(new Pays("Mongolie","Mongolie"));
        listPays.add(new Pays("Mozambique","Mozambique"));
        listPays.add(new Pays("Namibie","Namibie"));
        listPays.add(new Pays("Nauru","Nauru"));
        listPays.add(new Pays("Nepal","Népal"));
        listPays.add(new Pays("Nicaragua","Nicaragua"));
        listPays.add(new Pays("Niger","Niger"));
        listPays.add(new Pays("Nigeria","Nigeria"));
        listPays.add(new Pays("Niue","Niue"));
        listPays.add(new Pays("Norvège","Norvège"));
        listPays.add(new Pays("Nouvelle-Zelande","Nouvelle-Zélande"));
        listPays.add(new Pays("Oman","Oman"));
        listPays.add(new Pays("Ouganda","Ouganda"));
        listPays.add(new Pays("Ouzbekistan","Ouzbékistan"));
        listPays.add(new Pays("Pakistan","Pakistan"));
        listPays.add(new Pays("Panama","Panama"));
        listPays.add(new Pays("Papouasie-Nouvelle_Guinee","Papouasie - Nouvelle Guinée"));
        listPays.add(new Pays("Paraguay","Paraguay"));
        listPays.add(new Pays("Pays-Bas","Pays-Bas"));
        listPays.add(new Pays("Perou","Pérou"));
        listPays.add(new Pays("Philippines","Philippines"));
        listPays.add(new Pays("Pologne","Pologne"));
        listPays.add(new Pays("Portugal","Portugal"));
        listPays.add(new Pays("Qatar","Qatar"));
        listPays.add(new Pays("Republique_centrafricaine","République centrafricaine"));
        listPays.add(new Pays("Republique_dominicaine","République dominicaine"));
        listPays.add(new Pays("Republique_tcheque","République tchèque"));
        listPays.add(new Pays("Roumanie","Roumanie"));
        listPays.add(new Pays("Royaume-Uni","Royaume-Uni"));
        listPays.add(new Pays("Russie","Russie"));
        listPays.add(new Pays("Rwanda","Rwanda"));
        listPays.add(new Pays("Saint-Christophe-et-Nieves","Saint-Christophe-et-Niévès"));
        listPays.add(new Pays("Sainte-Lucie","Sainte-Lucie"));
        listPays.add(new Pays("Saint-Marin","Saint-Marin "));
        listPays.add(new Pays("Saint-Siège","Saint-Siège, ou leVatican"));
        listPays.add(new Pays("Saint-Vincent-et-les_Grenadines","Saint-Vincent-et-les Grenadines"));
        listPays.add(new Pays("Salomon","Salomon"));
        listPays.add(new Pays("Salvador","Salvador"));
        listPays.add(new Pays("Samoa_occidentales","Samoa occidentales"));
        listPays.add(new Pays("Sao_Tome-et-Principe","Sao Tomé-et-Principe"));
        listPays.add(new Pays("Senegal","Sénégal"));
        listPays.add(new Pays("Seychelles","Seychelles"));
        listPays.add(new Pays("Sierra_Leone","Sierra Leone"));
        listPays.add(new Pays("Singapour","Singapour"));
        listPays.add(new Pays("Slovaquie","Slovaquie"));
        listPays.add(new Pays("Slovenie","Slovénie"));
        listPays.add(new Pays("Somalie","Somalie"));
        listPays.add(new Pays("Soudan","Soudan"));
        listPays.add(new Pays("Sri_Lanka","Sri Lanka"));
        listPays.add(new Pays("Sued","Suède"));
        listPays.add(new Pays("Suisse","Suisse"));
        listPays.add(new Pays("Suriname","Suriname"));
        listPays.add(new Pays("Swaziland","Swaziland"));
        listPays.add(new Pays("Syrie","Syrie"));
        listPays.add(new Pays("Tadjikistan","Tadjikistan"));
        listPays.add(new Pays("Tanzanie","Tanzanie"));
        listPays.add(new Pays("Tchad","Tchad"));
        listPays.add(new Pays("Thailande","Thaïlande"));
        listPays.add(new Pays("Togo","Togo"));
        listPays.add(new Pays("Tonga","Tonga"));
        listPays.add(new Pays("Trinite-et-Tobago","Trinité-et-Tobago"));
        listPays.add(new Pays("Tunisie","Tunisie"));
        listPays.add(new Pays("Turkmenistan","Turkménistan"));
        listPays.add(new Pays("Turquie","Turquie"));
        listPays.add(new Pays("Tuvalu","Tuvalu"));
        listPays.add(new Pays("Ukraine","Ukraine"));
        listPays.add(new Pays("Uruguay","Uruguay"));
        listPays.add(new Pays("Vanuatu","Vanuatu"));
        listPays.add(new Pays("Venezuela","Venezuela"));
        listPays.add(new Pays("Viet_Nam","Viêt Nam"));
        listPays.add(new Pays("Yemen","Yémen"));
        listPays.add(new Pays("Yougoslavie","Yougoslavie"));
        listPays.add(new Pays("Zaire","Zaïre"));
        listPays.add(new Pays("Zambie","Zambie"));
        listPays.add(new Pays("Zimbabwe","Zimbabwe"));
		
		
		
		
		
		tableauFood.add(0, "carotte");
		tableauFood.remove(5);
		tableauFood.remove("endive");
		tableauFood.set(9, "remplacer");
		
		request.setAttribute("tableauFood", tableauFood);
		request.setAttribute("listPays", listPays);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/collectionTest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
