package pizza;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pizza.enums.PizzaSize;
import pizza.enums.PizzaType;
import pizza.factory.PizzaFactory;
import pizza.model.Pizza;
import pizza.service.PizzaService;
import pizza.service.impl.PizzaServiceImpl;

public class MargheritaPizzaTest {

	private PizzaFactory factory;
	
	private PizzaService pizzaService;
	
	@Before
	public void init() {
		factory = new PizzaFactory();
		pizzaService = new PizzaServiceImpl(factory);
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNullPizza_thenAssertionSucceed() {
		pizzaService.calculatePrice(null);
	}
	
	@Test
	public void givenValidPizzaInput_thenAssertionSucceed() {
		
		Pizza pizza = new Pizza();
		pizza.setType(PizzaType.MARGHERITA);
		pizza.setPizzaSize(PizzaSize.SMALL);
		pizza.setQuantity(1);
		
		List<Pizza> list = new ArrayList<>();
		list.add(pizza);
		
		float price = (float) pizzaService.calculatePrice(list);
		
		assertEquals(2.7841, price, 0.5);
	}
	
	@After
	public void destroy() {
		pizzaService = null;
		factory = null;
	}


}
