package behavioral.command;

/**
 * In OO programming, the command pattern is a behavioral design pattern in which
 * an object is used to encapsulate all information needed to perform an action or trigger
 * an event at a later time.
 * 
 * it allows you to encapsulate actions in objects. The key idea behind this pattern is 
 * to provide the means to decouple client from server.
 * 
 * @author Jason
 *
 */

public class ControllerTest {
	
	public static void main(String args[]) {
		Bulb bulb = new Bulb();
		
		Command turnOn = new TurnOn(bulb);
		Command turnOff = new TurnOff(bulb);
		
		Controller controller = new RemoteController();
		
		controller.execute(turnOn);
		turnOn.redo();
		
		controller.execute(turnOff);
		turnOff.undo();
	}
}
