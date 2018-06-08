package behavioral.memento;

public interface Editor {
	public EditorMemento save();
	
	public void restore(EditorMemento memento);
}
