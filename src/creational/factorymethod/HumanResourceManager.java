package creational.factorymethod;

/**
 * @when to use
 * It is useful when there is some generic processing in a class but the required sub-class
 * is dynamically decided at runtime. Put it another words, when the client doesn't know what 
 * exact sub-class it might need
 * 
 * 1. a class cann't anticipate the class of objects it must create
 * 2. a class wants its subclasses to specify the objects it creates
 * 3. classes delegate responsibility to one of several helper subclasses, and you want
 * to localize the knowledge of which helper subclass is the delegate
 * 
 * @author Jason
 *
 */

public class HumanResourceManager {	
	
	public static void hire() {
		HiringManager androidMgr = new AndroidHiringManager();
		androidMgr.takeInterview();
		
		HiringManager architectureMgr = new ArchitectureHiringManager();
		architectureMgr.takeInterview();
	}
}
