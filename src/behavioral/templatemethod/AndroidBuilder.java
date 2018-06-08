package behavioral.templatemethod;

public class AndroidBuilder extends Builder {

	@Override
	public void test() {
		System.out.println("Android Test");
	}

	@Override
	public void lint() {
		System.out.println("Android Lint");
	}

	@Override
	public void assemble() {
		System.out.println("Android Assemble");
	}

	@Override
	public void deploy() {
		System.out.println("Android Deploy");
	}

}
