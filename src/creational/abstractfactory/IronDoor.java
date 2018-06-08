package creational.abstractfactory;

public class IronDoor implements Door {

	@Override
	public void getDescription() {
		System.out.println("this is a iron door");
	}

}
