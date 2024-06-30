package bill.generator;

public class Pizza {

	private int price;
	private boolean veg;
	private int basePizza;

	public Pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		basePizza = this.price;
	}
	
	private int extraCheesPrize = 100;
	private int extraToppingPrize = 150;
	private int takeParsal = 20;
	
	private boolean isExtraCheesAdded= false;
	private boolean isExtraToppingAdded= false;
	private boolean isTakeAway = false;
	
	public void addExtraChees() {
		isExtraCheesAdded = true;
		this.price += extraCheesPrize;
	}
	
	public void addExtraToppings() {
		isExtraToppingAdded = true;
		this.price += extraToppingPrize;
	}
	
	public void takeAway() {
		isTakeAway = true;
		this.price += takeParsal;
	}
	
	
	public void getPizzaPrice() {
		String bills = "";
		System.out.println("Pizza Price : "+this.basePizza);
		if(isExtraCheesAdded) {
			bills += "Extra Chees Added : "+extraCheesPrize+"\n";
		}
		if(isExtraToppingAdded) {
			bills += "Extra Toppings Added : "+extraToppingPrize+"\n";
		}
		if(isTakeAway) {
			bills += "Take Away : "+takeParsal+"\n";
		}
		bills += "Total Bill : "+this.price;
		System.out.println(bills);
	}
	

}
