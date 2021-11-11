package pizza;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pizza.enums.Ingredients;
import pizza.enums.PizzaSize;
import pizza.enums.PizzaType;
import pizza.factory.PizzaFactory;
import pizza.model.Item;
import pizza.model.Pizza;
import pizza.service.PizzaService;
import pizza.service.impl.PizzaServiceImpl;
import pizza.util.Util;

public class MarinaraPizzaTest {
	
	private PizzaFactory factory;
	
	private PizzaService pizzaService;
	
	@Before
	public void init() {
		factory = new PizzaFactory();
		pizzaService = new PizzaServiceImpl(factory);
	}
	
	@Test
	public void givenNullInput_thenAssertionSucceed() {
		NullPointerException exception = assertThrows(NullPointerException.class, () -> pizzaService.calculatePrice(null));
		assertEquals(Util.NO_PIZZA_MSG, exception.getMessage());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenInvalidPizza_thenAssertionSucceed() {
		
		Pizza pizza = new Pizza();
		pizza.setType(null);
		pizza.setPizzaSize(PizzaSize.SMALL);
		pizza.setQuantity(1);
		pizza.setItems(null);
		
		List<Pizza> list = new ArrayList<>();
		list.add(pizza);
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(2.3551, price, 0.05);
	}
	
	@Test(expected = NullPointerException.class)
	public void givenEmptyListPizza_thenAssertionSucceed() {
		
		List<Pizza> list = new ArrayList<>();
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(0, price, 0.05);
	}
	
	@Test
	public void givenNullPizza_thenAssertionSucceed() {
		
		List<Pizza> list = new ArrayList<>();
		list.add(null);
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(0, price, 0.05);
	}
	
	@Test
	public void givenValidPizzaInput_thenAssertionSucceed() {
		
		Pizza pizza = new Pizza();
		pizza.setType(PizzaType.MARINARA);
		pizza.setPizzaSize(PizzaSize.SMALL);
		pizza.setQuantity(0);
		
		List<Pizza> list = new ArrayList<>();
		list.add(pizza);
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(2.3551, price, 0.05);
	}
	
	@Test
	public void givenValidPizzaInput_withoutPizzaSizeAndQuantity_thenAssertionSucceed() {
		
		// default size - SMALL
		// default quantity - 1
		Pizza pizza = new Pizza();
		pizza.setType(PizzaType.MARINARA);
		
		List<Pizza> list = new ArrayList<>();
		list.add(pizza);
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(2.3551, price, 0.05);
	}
	
	@Test
	public void givenValidPizza_withItems_thenAssertionSucceed() {
		
		Pizza pizza = new Pizza();
		pizza.setType(PizzaType.MARINARA);
		pizza.setPizzaSize(PizzaSize.SMALL);
		pizza.setQuantity(1);
		
		List<Item> items = new ArrayList<>();
		items.add(null);
		items.add(new Item(Ingredients.TOMATO, 1));
		items.add(new Item(Ingredients.BASIL, 1));
		items.add(new Item(Ingredients.ONION, 1));
		pizza.setItems(items);
		
		List<Pizza> list = new ArrayList<>();
		list.add(pizza);
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(2.7871, price, 0.05);
	}
	
	@After
	public void destroy() {
		pizzaService = null;
		factory = null;
	}


}
