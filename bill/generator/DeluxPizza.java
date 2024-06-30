package bill.generator;

public class DeluxPizza extends Pizza {

	public DeluxPizza(boolean veg) {
		super(veg);
		super.addExtraChees();
		super.addExtraToppings();
	}

	@Override
	public void addExtraChees() {
	}

	@Override
	public void addExtraToppings() {
	}

}
