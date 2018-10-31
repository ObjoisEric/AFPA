package fr.objois.business.pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.objois.bean.Pizza;

public class PizzaBusiness {

	public Connection connectDB() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			return cnx;
		} catch (Exception e) {
			e.printStackTrace();
		}		

		return null;
	}

	public Boolean addPizza(String libelle, String reference, Double prix, String urlImage) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			String sql = "INSERT INTO pizza(libelle, reference, prix,url_image) VALUES (?,?,?,?)";
			PreparedStatement statement = cnx.prepareStatement(sql);
			statement.setString(1, libelle);
			statement.setString(2, reference);
			statement.setDouble(3, prix);
			statement.setString(4, urlImage);
			statement.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}								






		return false;
	}

	public ArrayList<Pizza> getPizzas() {

		ArrayList<Pizza> listePizza = new ArrayList<>();

		try {	
			//Driver
			Class.forName("org.mariadb.jdbc.Driver");
			//Connection DB
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");	
			//Requete			
			Statement statement = cnx.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT id, libelle, reference, prix, url_image FROM pizza");

			while (resultat.next()) {
				Integer id = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				Double prix = resultat.getDouble("prix");
				String urlImage = resultat.getString("url_image");

				Pizza p = new Pizza(id, libelle, reference, prix, urlImage);

				listePizza.add(p);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}	




		return listePizza;
	}

	public void modifyPizza(Integer id, String libelle, String reference, Double prix, String urlImage) {

		try {

			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			String sql = "UPDATE pizza SET libelle = ?, reference= ?, prix = ?, url_image = ? WHERE id = ?";
			PreparedStatement statement = cnx.prepareStatement(sql);
			statement.setString(1, libelle);
			statement.setString(2, reference);
			statement.setDouble(3, prix);
			statement.setString(4, urlImage);
			statement.setInt(5, id);
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	public void deletePizza(Integer pizzaID) {

		try {

			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			String sql = "DELETE FROM pizza WHERE id = ?";
			PreparedStatement statement = cnx.prepareStatement(sql);
			statement.setInt(1, pizzaID);
			statement.executeUpdate();

			



		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	
	public void sortID() {
		
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");			
			
			ArrayList<Pizza> listPizza = getPizzas();
			Integer newpizzaID = 0;
			
			for (int i = 0; i < listPizza.size(); i++) {
				
				if ((i + 1 < listPizza.size()) ) {
					if ((listPizza.get(i).getId() + 1 ) != (listPizza.get(i+1).getId())) {
						newpizzaID = listPizza.get(i+1).getId();
						do {
							newpizzaID = newpizzaID - 1;
						} while ((listPizza.get(i).getId() + 1 ) != newpizzaID);
						String sql = "UPDATE pizza SET id = ? WHERE id = ?";
						PreparedStatement statement = cnx.prepareStatement(sql);
						statement.setInt(1, newpizzaID);
						statement.setInt(2, listPizza.get(i+1).getId());
						statement.executeUpdate();						
					} 
				}
			}
			String sqlLastID = "ALTER TABLE pizza AUTO_INCREMENT = ?";
			PreparedStatement statementLastID = cnx.prepareStatement(sqlLastID);
			statementLastID.setInt(1, listPizza.size());
			statementLastID.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


}
