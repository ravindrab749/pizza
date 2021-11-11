package pizza.model;

import java.util.HashMap;
import java.util.Map;

import pizza.enums.Ingredients;
import pizza.enums.PizzaSize;

public class ChicagoPizza extends BasePizza {

	public ChicagoPizza(PizzaSize size) {
		
		setPizzaSize(size);
		
		Map<Ingredients, Integer> itemsMap = new HashMap<>(4);
		itemsMap.put(Ingredients.PEPPERONI, 1);
		itemsMap.put(Ingredients.ONION, 1);
		itemsMap.put(Ingredients.MUSHROOMS, 1);
		itemsMap.put(Ingredients.GREEN_PAPERS, 1);
		
		setItemMap(itemsMap);
		
	}

}
