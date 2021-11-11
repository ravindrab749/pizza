package pizza.model;

import java.util.HashMap;
import java.util.Map;

import pizza.enums.Ingredients;
import pizza.enums.PizzaSize;

public class MargheritaPizza extends BasePizza {

	public MargheritaPizza(PizzaSize size) {
		
		setPizzaSize(size);
		
		Map<Ingredients, Integer> itemsMap = new HashMap<>(4);
		itemsMap.put(Ingredients.TOMATO, 1);
		itemsMap.put(Ingredients.SLICED_MOZZARELLA, 1);
		itemsMap.put(Ingredients.OLIVE_OIL, 1);
		itemsMap.put(Ingredients.BASIL, 1);
		setItemMap(itemsMap);
	}

}
