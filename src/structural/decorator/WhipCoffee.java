package structural.decorator;

public class WhipCoffee implements Coffee {
	private Coffee coffee;
	
	public WhipCoffee(Coffee conffee) {
		this.coffee = conffee;
	}

	@Override
	public float getCost() {
		return this.coffee.getCost() + 6;
	}

	@Override
	public String getDescription() {
		return this.coffee.getDescription() + ", adding whip";
	}

}
