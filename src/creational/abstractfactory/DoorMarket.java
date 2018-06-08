package creational.abstractfactory;

/**
 * @when to use:
 * there are interrelated dependencies with not that simple creation logic involved
 * 
 * 1. a system should be independent of how its products are created, composed, and 
 * represented;
 * 2. a system should be configured with one of multiple families of products
 * 3. a family of related product objects is designed to be used together, and you need 
 * to enforce this constraint
 * 4. you want to provide a class library of products, and you want to reveal just there interfaces
 *
 * 
 * @author Jason
 *
 */

public class DoorMarket {

	public static void main(String[] args) {
		DoorFactory woodenFactory = new WoodDoorFactory();
		Door woodDoor = woodenFactory.makeDoor();
		woodDoor.getDescription();
		DoorExpert woodExpert = woodenFactory.makeExpert();
		woodExpert.getDescription();
		
		DoorFactory ironFactory = new IronDoorFactory();
		ironFactory.makeDoor().getDescription();
		ironFactory.makeExpert().getDescription();
	}

}
