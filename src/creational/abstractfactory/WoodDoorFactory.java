package creational.abstractfactory;

public class WoodDoorFactory implements DoorFactory {
	
	@Override
	public Door makeDoor() {
		System.out.println("making a wood door");
		return new WoodDoor();
	}

	@Override
	public DoorExpert makeExpert() {
		System.out.println("making a wooden fit expert");
		return new Carpenter();
	}

}
