package creational.factorymethod;

/** delegate interview task to the interviewer */

public abstract class HiringManager {
	public abstract Interviewer makeInterviewer();
	
	public void takeInterview() {
		Interviewer interviewer = makeInterviewer();
		interviewer.askQuestions();
	}
}
