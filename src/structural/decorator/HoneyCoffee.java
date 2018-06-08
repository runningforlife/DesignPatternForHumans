package structural.decorator;

public class HoneyCoffee implements Coffee {
	private Coffee coffee;
	
	public HoneyCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public float getCost() {
		return this.coffee.getCost() + 3;
	}
	
	@Override
	public String getDescription() {
		return this.coffee.getDescription() + ", adding honey";
	}

}
