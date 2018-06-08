package creational.abstractfactory;

public class WoodDoor implements Door {

	@Override
	public void getDescription() {
		System.out.println("this is a Wooden door");
	}
}
