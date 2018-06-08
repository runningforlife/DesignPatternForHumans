package creational.abstractfactory;

public class IronDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		System.out.println("making an iron door");
		return new IronDoor();
	}

	@Override
	public DoorExpert makeExpert() {
		System.out.println("making an iron door fittign expert");
		return new Welder();
	}

}
