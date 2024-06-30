package bill.generator;

public class PizzBillGenerator {

	public static void main(String[] args) {

//		Pizza basePizza = new Pizza(false);
//		basePizza.addExtraChees();
//		basePizza.addExtraToppings();
//		basePizza.takeAway();
//		basePizza.getPizzaPrice();
		
		DeluxPizza dp = new DeluxPizza(true);
		dp.takeAway();
		dp.getPizzaPrice();
	}

}
