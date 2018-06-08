package structural.adapter;

public class DogAdapter implements Lion {
	private Dog dog;
	
	public DogAdapter(Dog dog) {
		this.dog = dog;
	}

	@Override
	public void roar() {
		this.dog.bark();
	}
}
