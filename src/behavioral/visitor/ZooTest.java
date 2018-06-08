package behavioral.visitor;

/**
 * the visitor pattern is a way of separating an algorithm from an object structure on which
 * it operates. A practical result of this separation is the ability to add new operations to 
 * existing object structure without modifying those structures. It is one of ways to follow the 
 * Open/Closed principle(open for extension; closed for modification)
 * 
 * @author Jason
 *
 */

public class ZooTest {
	
	public static void main(String args[]) {
		Speak speak = new Speak();
		Jump jump = new Jump();
		
		Monkey monkey = new Monkey();
		Lion lion = new Lion();
		Dolphin dolphin = new Dolphin();
		
		monkey.accept(speak);
		monkey.accept(jump);
		lion.accept(speak);
		lion.accept(jump);
		dolphin.accept(speak);
		dolphin.accept(jump);
	}
}
