package creational.abstractfactory;

public class Carpenter implements DoorExpert {

	@Override
	public void getDescription() {
		System.out.println("I can fit wood door");
	}

}
