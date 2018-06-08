package creational.factorymethod;

public class AndroidHiringManager extends HiringManager {

	@Override
	public Interviewer makeInterviewer() {
		return new AndroidInterviewer();
	}
}
