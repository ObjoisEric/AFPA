package fr.objois.pizzeria.client.controller.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.objois.pizzeria.client.business.IClientBusiness;
import fr.objois.pizzeria.client.controller.IClientController;
import fr.objois.pizzeria.client.domain.Client;

@Controller
public class ClientControllerImpl implements IClientController {
	
	@Autowired
	IClientBusiness clientBusiness;

	@Override
	@RequestMapping("/clients")
	public String getAllClient(Model model) {
		
		
		List<Client> listeClient = clientBusiness.getAllClient();
		
		
		model.addAttribute("listeClient",listeClient);
		
		return "client/clients";
	}
	

}
