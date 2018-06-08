package structural.proxy;

public class HallDoor implements Door {

	@Override
	public void open() {
		System.out.println("open hall door");
	}

	@Override
	public void close() {
		System.out.println("close the hall door");
	}

}
