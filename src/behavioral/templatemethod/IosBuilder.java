package behavioral.templatemethod;

public class IosBuilder extends Builder {

	@Override
	public void test() {
		System.out.println("Ios Test");
	}

	@Override
	public void lint() {
		System.out.println("Ios Lint");
	}

	@Override
	public void assemble() {
		System.out.println("Ios Assemble");
	}

	@Override
	public void deploy() {
		System.out.println("Ios Deploy");
	}

}
