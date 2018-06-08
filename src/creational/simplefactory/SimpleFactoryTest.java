package creational.simplefactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		Door myDoor = DoorFactory.makeDoor(200, 500);
		System.out.println("the width of my door " + myDoor.getWidth());
		System.out.println("the height of my door " + myDoor.getHeight());
	}

}
