package fr.objois.client.business.impl;

import java.util.ArrayList;
import java.util.List;

import fr.objois.client.business.IClientBusiness;
import fr.objois.client.dao.IClientDao;
import fr.objois.client.dao.impl.ClientDaoImpl;
import fr.objois.client.domain.Client;

public class ClientBusinessImpl implements IClientBusiness{
	IClientDao clientDao = new ClientDaoImpl();
	
	
	@Override
	public List<Client> findAll() {
		
		List<Client> listeClient = new ArrayList<>();
		
		listeClient = clientDao.findAll();
		return listeClient;
	}


	@Override
	public Client clientDetail(Integer id) {
		Client client = clientDao.clientDetail(id);
		return client;
	}


	@Override
	public void ajoutClient(Client clientAAjouter) {
		clientDao.ajoutClient(clientAAjouter);
		
	}


	@Override
	public void modifyClient(Client clientAModifier) {
		clientDao.modifyClient(clientAModifier);
		
	}
	
	

}
