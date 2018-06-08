package behavioral.state;

public class DefaultState implements WritingState {

	@Override
	public void write(String words) {
		System.out.println(words);
	}

}
