package creational.factorymethod;

public class ArchitectureHiringManager extends HiringManager {

	@Override
	public Interviewer makeInterviewer() {
		return new ArchitectureInterviewer();
	}
}
