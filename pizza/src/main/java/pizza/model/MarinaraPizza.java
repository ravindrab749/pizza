package pizza.model;

import java.util.HashMap;
import java.util.Map;

import pizza.enums.Ingredients;
import pizza.enums.PizzaSize;

public class MarinaraPizza extends BasePizza {

	public MarinaraPizza(PizzaSize size) {
		
		setPizzaSize(size);
		
		Map<Ingredients, Integer> itemsMap = new HashMap<>(4);
		itemsMap.put(Ingredients.TOMATO, 1);
		itemsMap.put(Ingredients.GARLIC, 1);
		itemsMap.put(Ingredients.OLIVE_OIL, 1);
		itemsMap.put(Ingredients.OREGANO, 1);
		setItemMap(itemsMap);
	}

}
