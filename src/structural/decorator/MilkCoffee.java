package structural.decorator;

public class MilkCoffee implements Coffee {
	private Coffee coffee;
	
	public MilkCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public float getCost() {
		return this.coffee.getCost() + 5;
	}
	
	@Override
	public String getDescription() {
		return this.coffee.getDescription() + ", adding milk";
	}
}
