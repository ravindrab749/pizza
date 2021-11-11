package pizza.model;

import pizza.enums.Ingredients;

public class Item {

	private Ingredients ingredient;
	private int quantity;
	
	public Item(Ingredients ing, int qty) {
		ingredient = ing;
		quantity = qty;
	}
	
	public Ingredients getIngredient() {
		return ingredient;
	}

	/*
	 * public void setIngredient(Ingredients ingredient) { this.ingredient =
	 * ingredient; }
	 */
	public int getQuantity() {
		return quantity;
	}
	/*
	 * public void setQuantity(int quantity) { this.quantity = quantity; }
	 */

}
