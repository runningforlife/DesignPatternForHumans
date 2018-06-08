package structural.facade;

public class MacPro implements Computer {

	@Override
	public void getElectricShock() {
		System.out.println("ouch!");
	}

	@Override
	public void makeSound() {
		System.out.println("beep beep");
	}

	@Override
	public void showLoadingScreen() {
		System.out.println("loading...");
	}

	@Override
	public void bam() {
		System.out.println("ready to be used");
	}

	@Override
	public void shutDown() {
		System.out.println("bup bup bup bzzz");
	}

	@Override
	public void sooth() {
		System.out.println("Zzzzz");
	}

	@Override
	public void pullCurrent() {
		System.out.println("Haaaah");
	}

}
