package pizza.enums;

import pizza.util.Util;

public enum Ingredients {

	GARLIC(Util.GARLIC_INGRED), TOMATO(Util.TOMATO_INGRED), PEPPERONI(Util.PEPPERONI_INGRED),
	MUSHROOMS(Util.MUSHROOM_INGRED), OLIVE_OIL(Util.OLIVE_OIL_INGRED), OREGANO(Util.OREGANO_INGRED),
	ONION(Util.ONION_INGRED), GREEN_PAPERS(Util.GREEN_PAPERS_INGRED), SLICED_MOZZARELLA(Util.SLICED_MOZZARELLA_INGRED),
	BASIL(Util.BASIL_INGRED);
	
	Ingredients(double price) {
		this.price = price;
	}
	
	private double price;
	
	public double getPrice() {
		return this.price;
	}
}
