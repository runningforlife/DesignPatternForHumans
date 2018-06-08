package creational.abstractfactory;

public class Welder implements DoorExpert {

	@Override
	public void getDescription() {
		System.out.println("I can fit iron door");
	}

}
