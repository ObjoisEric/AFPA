package fr.objois.client.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.objois.client.business.IClientBusiness;
import fr.objois.client.dao.IClientDao;
import fr.objois.client.dao.impl.ClientDaoImpl;
import fr.objois.client.domain.Client;

public class ClientBusinessImpl implements IClientBusiness{
	private IClientDao clientDao = new ClientDaoImpl();
	private  static Logger LOGGER = LoggerFactory.getLogger(ClientBusinessImpl.class);

	
	
	@Override
	public List<Client> findAll() {
		
		LOGGER.info("trouver tout les clients business");
		List<Client> listeClient = new ArrayList<>();
		
		listeClient = clientDao.findAll();
		return listeClient;
	}


	@Override
	public Client clientDetail(Integer id) {
		LOGGER.info("detail client business");

		Client client = clientDao.clientDetail(id);
		return client;
	}


	@Override
	public void ajoutClient(Client clientAAjouter) {
		LOGGER.info("ajout de client business");
		clientDao.ajoutClient(clientAAjouter);
		
	}


	@Override
	public void modifyClient(Client clientAModifier) {
		LOGGER.info("modification client business");
		clientDao.modifyClient(clientAModifier);
		
	}
	
	

}
