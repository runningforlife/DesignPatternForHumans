package structural.facade;

/**
 * facade pattern provides a simplified interface to a complex subsystem
 * 
 * a facade is an object that provides a simplified interface to a larger body of code
 * such as a class library
 * 
 * @author Jason
 *
 */

public class MacProTest {
	
	public static void main(String args[]) {
		MacUserInterface mui = new MacUserInterface(new MacPro());
		
		mui.turnOn();
		mui.turnOff();
	}

}
