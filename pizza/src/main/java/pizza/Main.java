package pizza;

import java.util.ArrayList;
import java.util.List;

import pizza.enums.PizzaSize;
import pizza.enums.PizzaType;
import pizza.factory.PizzaFactory;
import pizza.model.Pizza;
import pizza.service.PizzaService;
import pizza.service.impl.PizzaServiceImpl;

/*
 * public class Main {
 * 
 * public static void main(String[] args) {
 * 
 * // Pizza type is mandatory - Marinara / Margherita / Chicago // Pizza size
 * default - Small // Pizza quantity default - 1
 * 
 * List<Pizza> pizzas = null; pizzas = new ArrayList<>();
 * 
 * Pizza pizza = new Pizza(); pizza.setType(PizzaType.MARINARA);
 * pizza.setPizzaSize(PizzaSize.SMALL); pizzas.add(pizza);
 * 
 * Pizza pizza2 = new Pizza(); pizza2.setType(PizzaType.MARGHERITA);
 * pizza2.setPizzaSize(PizzaSize.SMALL); pizzas.add(pizza2);
 * 
 * PizzaService pizzaService = new PizzaServiceImpl(new PizzaFactory()); double
 * price = pizzaService.calculatePrice(pizzas);
 * 
 * System.out.println((float)price); }
 * 
 * }
 */