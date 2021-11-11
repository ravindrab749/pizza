package pizza.factory;

import pizza.enums.PizzaSize;
import pizza.enums.PizzaType;
import pizza.model.BasePizza;
import pizza.model.ChicagoPizza;
import pizza.model.MargheritaPizza;
import pizza.model.MarinaraPizza;

public class PizzaFactory {
	
	public BasePizza createPizza(PizzaType type, PizzaSize size) {
		switch (type) {
		case MARGHERITA:
			return new MargheritaPizza(size);
		case MARINARA:
			return new MarinaraPizza(size);
		default:
			return new ChicagoPizza(size);
		}
	}
}
