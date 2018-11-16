package fr.objois.pizzeria.controller;

import org.springframework.ui.Model;

public interface IPizzaController {
	
	public String test(Model model);

	public String getTableau(Model model);

	public String afficherToutePizzas(Model model);

}
