package behavioral.state;

/**
 * With the state pattern , a state machine is implemented by implementing
 * each individual state as a derived class of the state pattern interface,
 * and implementing state transitions by invoking methods defined by the pattern's
 * superclass. The state pattern can be interpreted as strategy pattern which is
 * able to switch the current strategy through invocations of methods defined 
 * in the pattern's interface
 * 
 * It lets you change the behavior of a class when the state changes
 * 
 * @author Jason
 *
 */

public class TextEditorTest {
	
	public static void main(String args[]) {
		TextEditor textEditor = new TextEditor(new DefaultState());
		
		textEditor.type("Fight for dream; fight for life");
		textEditor.setState(new UpperCase());
		
		textEditor.type("Life is a journey where you can open your mind to enjoy");
		textEditor.type("Be curious anytime, anywhere!");
		
		textEditor.setState(new LowerCase());
		textEditor.type("Be the foolest person in the team");
		textEditor.type("There is always a better way to solve the problem");
	}
}
