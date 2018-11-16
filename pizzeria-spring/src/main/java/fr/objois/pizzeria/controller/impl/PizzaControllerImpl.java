package fr.objois.pizzeria.controller.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.objois.pizzeria.controller.IPizzaController;
import fr.objois.pizzeria.domain.Pizza;
import fr.objois.pizzeria.pizza.business.IPizzaBusiness;


@Controller
public class PizzaControllerImpl implements IPizzaController{
	
	@Autowired
	private IPizzaBusiness pizzaBusiness;
	
	@Override
	@RequestMapping("/test")
	public String test(Model model) {
		String chaine ="transmission de datas avec Thymeleaft";
		model.addAttribute("chaine",chaine);
		
		return "test";
	}
	
	@Override
	@RequestMapping("/tableau")
	public String getTableau(Model model) {		
		List<String> listChaine = pizzaBusiness.getListe();
		model.addAttribute("listChaine",listChaine);
		return "tableau";
	}
	
	@Override
	@RequestMapping("/pizzas")
	public String afficherToutePizzas(Model model) {
		List<Pizza> pizzaListe = pizzaBusiness.getAllPizza();
		model.addAttribute("pizzaListe",pizzaListe);
		return "pizza/pizzas";
	}

}
