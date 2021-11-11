package pizza.model;

import java.util.List;

import pizza.enums.PizzaSize;
import pizza.enums.PizzaType;

public class Pizza {
	
	private PizzaType type;
	
	private int quantity;
	
	private PizzaSize pizzaSize;
	
	List<Item> items;

	public PizzaType getType() {
		return type;
	}

	public void setType(PizzaType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
