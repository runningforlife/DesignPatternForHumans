package structural.decorator;

public class SimpleCoffee implements Coffee {

	@Override
	public float getCost() {
		return 9;
	}

	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

}
