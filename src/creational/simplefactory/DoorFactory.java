package creational.simplefactory;

/**
 * @when to use
 * when creating an object is not just a few assignments and involves some 
 * logic, it'd better to put it in a dedicated factory instead of repeating
 * the same code everywhere.
 * 
 * @author Jason
 *
 */

public class DoorFactory {
	
	public static Door makeDoor(float width, float height) {
		return new IronDoor(width, height);
	}
}
