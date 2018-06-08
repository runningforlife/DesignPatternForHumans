package behavioral.command;

public abstract class Command {
	protected Switch mSwitch;
	
	protected Command(Switch sw) {
		mSwitch = sw;
	}
	
	public abstract void execute();
	
	public abstract void undo();
	
	public abstract void redo();
}
