package pizza.service;

import java.util.List;

import pizza.model.Pizza;

public interface PizzaService {
	
	double calculatePrice(List<Pizza> pizzaList);

}
