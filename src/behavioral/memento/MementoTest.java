package behavioral.memento;

/**
 * The memento pattern is a software design that provides the ability to restore
 * an object to its previous state(undo via rollback)
 * 
 * @author Jason
 *
 */

public class MementoTest {
	
	public static void main(String args[]) {
		EditorImpl editor = new EditorImpl("this is the first word");
		System.out.println("content=" + editor.getContent());
		
		EditorMemento memento = editor.save();
		
		editor.type("this is the second word...");
		System.out.println("content=" + editor.getContent());
		
		editor.restore(memento);
		System.out.println("content=" + editor.getContent());
	}

}
