package behavioral.command;

public class TurnOn extends Command {
	
	public TurnOn(Switch sw) {
		super(sw);
	}

	@Override
	public void execute() {
		mSwitch.turnOn();
	}

	@Override
	public void undo() {
		mSwitch.turnOff();
	}

	@Override
	public void redo() {
		mSwitch.turnOn();
	}

}
