package structural.proxy;

/**
 * using the proxy pattern, a class represents the functionality of another class
 * 
 * @author Jason
 *
 */

public class DoorProxyTest {

	public static void  main(String args[]) {
		DoorProxy dp = new DoorProxy(new HallDoor());
		
		dp.open("screte");
		dp.close();
	}
}
