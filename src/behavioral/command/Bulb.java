package behavioral.command;

public class Bulb implements Switch {
	
	@Override
	public void turnOn() {
		System.out.println("Bulb is lit");
	}

	@Override
	public void turnOff() {
		System.out.println("Darkeness is comming");
	}
}
