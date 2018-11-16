package fr.objois.pizzeria.pizza.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.objois.pizzeria.domain.Pizza;
import fr.objois.pizzeria.pizza.business.IPizzaBusiness;


@Service
public class PizzaBusinessImpl implements IPizzaBusiness{

	@Override
	public List<String> getListe() {
		List<String> listChaine = new ArrayList<>();
		listChaine.add("Bonjour");
		listChaine.add("Bonsoir");
		listChaine.add("Hello");
		listChaine.add("Salut");
		listChaine.add("Hi");
		listChaine.add("o/");
		return listChaine;
	}

	@Override
	public List<Pizza> getAllPizza() {
		List<Pizza> pizzaList = new ArrayList<>();
		pizzaList.add(new Pizza(1, "cerise", "CER", 10.0, "cerise.jpg"));
		pizzaList.add(new Pizza(2, "banane", "BAN", 10.0, "banane.jpg"));
		pizzaList.add(new Pizza(3, "grenade", "GRE", 10.0, "grenade.jpg"));
		pizzaList.add(new Pizza(4, "citron", "CIT", 10.0, "citron.jpg"));
		pizzaList.add(new Pizza(5, "ananas", "ANA", 10.0, "ananas.jpg"));
		
		
		return pizzaList;
	}

}
