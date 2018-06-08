package structural.facade;

public class MacUserInterface {
	private Computer computer;
	
	public MacUserInterface(Computer computer) {
		this.computer = computer;
	}
	
	public void turnOn() {
		this.computer.getElectricShock();
		this.computer.makeSound();
		this.computer.showLoadingScreen();
		this.computer.bam();
	}
	
	public void turnOff() {
		this.computer.shutDown();
		this.computer.pullCurrent();
		this.computer.sooth();
	}
}
