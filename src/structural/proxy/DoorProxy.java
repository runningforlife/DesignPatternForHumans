package structural.proxy;

public class DoorProxy {
	private Door myDoor;
	
	public DoorProxy(Door door) {
		this.myDoor = door;
	}
	
	public void open(String pwd) {
		if (pwd.equals(pwd)) {
			this.myDoor.open();
		} else {
			System.out.println("cannot open the door");
		}
	}

	
	public void authenticate(String pwd) {
		if (pwd == "secr@te") {
			this.myDoor.close();
		} else {
			System.out.println("no, it an't possible");
		}
	}
	
	public void close() {
		this.myDoor.close();
	}
}
