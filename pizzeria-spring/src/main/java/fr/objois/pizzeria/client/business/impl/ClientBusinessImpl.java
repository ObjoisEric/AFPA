package fr.objois.pizzeria.client.business.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.pizzeria.client.business.IClientBusiness;
import fr.objois.pizzeria.client.domain.Client;
import fr.objois.pizzeria.client.repository.IClientRepository;

@Service
public class ClientBusinessImpl implements IClientBusiness {
	@Autowired
	IClientRepository clientRepository;
	
	
	
	@Override
	public List<Client> getAllClient() {
		List<Client> listeClient = clientRepository.findAll();
	
		return listeClient;
	}
	
	
}
