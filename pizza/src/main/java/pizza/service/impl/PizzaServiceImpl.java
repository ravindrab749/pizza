package pizza.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import pizza.factory.PizzaFactory;
import pizza.model.BasePizza;
import pizza.model.Pizza;
import pizza.service.PizzaService;
import pizza.util.Util;

public class PizzaServiceImpl implements PizzaService {
	
	public PizzaFactory factory;
	
	public PizzaServiceImpl(PizzaFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public double calculatePrice(List<Pizza> pizzaList) {
		
		if(pizzaList == null || pizzaList.isEmpty()) {
			throw new NullPointerException(Util.NO_PIZZA_MSG);
		}
		
		double total = 0;
		
		total = pizzaList.stream().filter(Objects::nonNull).map(this::calcPizzaCost).collect(Collectors.summingDouble(Double::doubleValue));
		
		return total;
	}
	
	private double calcPizzaCost(Pizza pizza) {
		
		BasePizza base = factory.createPizza(pizza.getType(), pizza.getPizzaSize());
		int qty = pizza.getQuantity() <= 0 ? 1 : pizza.getQuantity();
		
		Optional.ofNullable(pizza.getItems()).ifPresent(list -> list.stream().filter(Objects::nonNull).filter(i -> i.getQuantity() > 0)
				.forEach(i -> base.addIngredient(i.getIngredient(), i.getQuantity())));
		
		double price = 0;
		
		price = base.getItemMap().entrySet().stream().map(e -> e.getKey().getPrice() * e.getValue())
				.collect(Collectors.summingDouble(Double::doubleValue));
		
		double tot = (base.getPizzaSize().getPrice() + price) * qty;
		
		return tot;
	}

}
