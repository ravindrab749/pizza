package pizza.enums;

import pizza.util.Util;

public enum PizzaSize {
	
	SMALL(Util.SMALL_PIZZA_PRICE), MEDIUM(Util.MEDIUM_PIZZA_PRICE), LARGE(Util.LARGE_PIZZA_PRICE);
	
	PizzaSize(double price) {
		this.price = price;
	}
	
	private double price;

	public double getPrice() {
		return price;
	}

}
