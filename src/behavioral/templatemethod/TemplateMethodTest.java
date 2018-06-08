package behavioral.templatemethod;

/**
 * the template method is a pattern that defines the program skeleton of 
 * an algorithm in an operation, deferring some steps to subclass. It lets
 * one redefine certain steps of an algorithm without changing algorithm's 
 * structure.
 * 
 * @author Jason
 *
 */

public class TemplateMethodTest {

	public static void main(String args[]) {
		Builder android = new AndroidBuilder();
		android.build();
		
		Builder ios = new IosBuilder();
		ios.build();
	}
}
