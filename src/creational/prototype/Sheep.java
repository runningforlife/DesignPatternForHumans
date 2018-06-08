package creational.prototype;

public class Sheep extends Animal {
	private String category;
	
	public Sheep(String name, float weight, String category) {
		super(name, weight);
		
		this.category = category;
	}
	
	@Override 
	public Animal clone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}

	@Override
	public String toString() {
		return "sheep category=" + category
				+ super.toString();
	}
}
