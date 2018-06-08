package behavioral.memento;

public class EditorImpl implements Editor {
	private String content;
	
	public EditorImpl(String content) {
		this.content = content;
	}
	
	public void type(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}

	@Override
	public EditorMemento save() {
		return new EditorMemento(this.content);
	}

	@Override
	public void restore(EditorMemento memento) {
		this.content = memento.getContent();
	}

}
