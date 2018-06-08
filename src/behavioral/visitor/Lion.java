package behavioral.visitor;

public class Lion implements Animal {
	
	public void roar() {
		System.out.println("Roaaaar!");
	}

	@Override
	public void accept(AnimalOperation operation) {
		operation.visitLion(this);
	}

}
