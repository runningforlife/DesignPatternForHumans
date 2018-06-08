package creational.singleton;

public class PresidentTest {
	
	public static void main(String args[]) {
		President donald = President.getInstance();
		
		President trump = President.getInstance();
		
		if (donald == trump) {
			System.out.println("oh, same president");
		}
	}

}
