package fr.objois.client.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import fr.objois.client.dao.IClientDao;
import fr.objois.client.domain.Client;

public class ClientDaoImpl implements IClientDao{
	private  static Logger LOGGER = LoggerFactory.getLogger(ClientDaoImpl.class);


	@Override
	public List<Client> findAll() {
		LOGGER.info("trouver tout les clients dao ");
		List<Client> listeClient = new ArrayList<>();		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			
			Statement statement = cnx.createStatement();
			String sql = "SELECT ID,numero_client, NOM, PRENOM,ADRESS,TEL_FIXE,TEL_PORTABLE,DATE_NAISSANCE,EMAIL FROM client";
			ResultSet resultat = statement.executeQuery(sql);
			while (resultat.next()) {
				
				Integer id = resultat.getInt("ID");
				Integer numeroClient = resultat.getInt("numero_client");
				String nom = resultat.getString("NOM");
				String prenom = resultat.getString("PRENOM");
				String adresse = resultat.getString("ADRESS");
				String telFixe = resultat.getString("TEL_FIXE");
				String telPortable = resultat.getString("TEL_PORTABLE");
				String dateNaissance = resultat.getString("DATE_NAISSANCE");
				String email = resultat.getString("EMAIL");
				
				Client client = new Client(id,numeroClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email);
				
				listeClient.add(client);
				
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.info("message"+e);
		}
		
		return listeClient;
	}

	@Override
	public Client clientDetail(Integer id) {
		
		LOGGER.info("client detail dao ");
		Client client = new Client();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			
			String sql = "SELECT * FROM client WHERE id =?";
			PreparedStatement statement = cnx.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultat = statement.executeQuery();
			if (resultat.next()) {
				client.setId(resultat.getInt("ID"));
				client.setNumeroClient(resultat.getInt("numero_client"));
				client.setNom(resultat.getString("NOM"));
				client.setPrenom(resultat.getString("PRENOM"));
				client.setAdresse(resultat.getString("ADRESS")); 
				client.setTelFixe(resultat.getString("TEL_FIXE"));
				client.setTelPortable(resultat.getString("TEL_PORTABLE")); 
				client.setDateNaissance(resultat.getString("DATE_NAISSANCE"));
				client.setEmail(resultat.getString("EMAIL"));
			}			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.info(""+e);
		}
		
		
		return client;
	}

	@Override
	public void ajoutClient(Client clientAAjouter) {
		
		LOGGER.info("ajout de client dao");
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			String sql="INSERT INTO client(numero_client,NOM,PRENOM,ADRESS,TEL_FIXE,TEL_PORTABLE,DATE_NAISSANCE,EMAIL) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement statement = cnx.prepareStatement(sql);
			statement.setInt(1, clientAAjouter.getNumeroClient());
			statement.setString(2, clientAAjouter.getNom());
			statement.setString(3, clientAAjouter.getPrenom());
			statement.setString(4, clientAAjouter.getAdresse());
			statement.setString(5, clientAAjouter.getTelFixe());
			statement.setString(6, clientAAjouter.getTelPortable());
			statement.setString(7, clientAAjouter.getDateNaissance());
			statement.setString(8, clientAAjouter.getEmail());
			statement.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.info(e.getMessage());
		}
		
		
	}

	@Override
	public void modifyClient(Client clientAModifier) {
		
		LOGGER.info("modifier client dao");
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			String sql = "UPDATE client SET NUMERO_CLIENT = ?,"
										+ " NOM= ?, "
										+ " PRENOM = ?, "
										+ " ADRESS = ?, "
										+ " TEL_FIXE = ?, "
										+ " TEL_PORTABLE = ?, "
										+ " DATE_NAISSANCE = ?, "
										+ " EMAIL = ? "
										+ " WHERE id = ?";
			PreparedStatement statement = cnx.prepareStatement(sql);
			statement.setInt(1, clientAModifier.getNumeroClient());
			statement.setString(2, clientAModifier.getNom());
			statement.setString(3, clientAModifier.getPrenom());
			statement.setString(4, clientAModifier.getAdresse());
			statement.setString(5, clientAModifier.getTelFixe());
			statement.setString(6, clientAModifier.getTelPortable());
			statement.setString(7, clientAModifier.getDateNaissance());
			statement.setString(8, clientAModifier.getEmail());
			statement.setInt(9, clientAModifier.getId());
			statement.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.info(""+e);

		}
		
	}

}
