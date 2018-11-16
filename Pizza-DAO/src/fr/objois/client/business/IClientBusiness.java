package fr.objois.client.business;

import java.util.List;

import fr.objois.client.domain.Client;

public interface IClientBusiness {
	
	public List<Client> findAll();

	public Client clientDetail(Integer id);

	public void ajoutClient(Client clientAAjouter);

	public void modifyClient(Client clientAModifier);	

}
