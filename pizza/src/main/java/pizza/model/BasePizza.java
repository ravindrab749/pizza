package pizza.model;

import java.util.Map;

import pizza.enums.Ingredients;
import pizza.enums.PizzaSize;

public abstract class BasePizza {
	
	private Map<Ingredients, Integer> itemMap = null;
	private PizzaSize pizzaSize;
	
	public Map<Ingredients, Integer> getItemMap() {
		return itemMap;
	}

	public void setItemMap(Map<Ingredients, Integer> itemMap) {
		this.itemMap = itemMap;
	}
	
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		if(pizzaSize == null) {
			pizzaSize = PizzaSize.SMALL;
		}
		this.pizzaSize = pizzaSize;
	}

	public void addIngredient(Ingredients ing, int qty) {

		if (itemMap.containsKey(ing)) {
			qty += itemMap.get(ing);
		}

		this.itemMap.put(ing, qty);
	}
	 
}
