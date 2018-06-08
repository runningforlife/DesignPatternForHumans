package behavioral.mediator;

/**
 * the mediator pattern defines an object that encapsulates how a set of objects 
 * interact. Mediator pattern adds a 3rd party object(mediator) to control the 
 * interaction between two objects(called colleagues). It helps reduce the coupling
 * between the classes communicating with each other.
 * 
 * @author Jason
 *
 */

public class MediatorTest {
	
	public static void main(String args[]) {
		ChatMediator mediator = new ChatRoom();
		
		User john = new User("John", mediator);
		User sam = new User("Sam", mediator);
		
		john.sendMessage("there is no easy path to take");
		sam.sendMessage("calm down and try your best to be awesome");
	}
}
