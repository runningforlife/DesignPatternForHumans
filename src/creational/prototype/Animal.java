package creational.prototype;

/*
 * an animal can be cloned
 */
public abstract class Animal implements Cloneable {
	private String name;
	private float weight;
	
	public Animal(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(float w) {
		this.weight = w;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public Animal clone() throws CloneNotSupportedException {
		return (Animal) super.clone();
	}
	
	@Override
	public String toString() {
		return "\nname=" + name
				+ "\nweight=" + weight;
	}
}
