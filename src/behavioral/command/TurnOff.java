package behavioral.command;

public class TurnOff extends Command {

	protected TurnOff(Switch sw) {
		super(sw);
	}

	@Override
	public void execute() {
		mSwitch.turnOff();
	}

	@Override
	public void undo() {
		mSwitch.turnOn();
	}

	@Override
	public void redo() {
		mSwitch.turnOff();
	}

}
