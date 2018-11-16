package fr.objois.pizzeria.pizza.business;

import java.util.List;

import fr.objois.pizzeria.domain.Pizza;

public interface IPizzaBusiness {
	
	public List<String> getListe();
	public List<Pizza> getAllPizza();

}
