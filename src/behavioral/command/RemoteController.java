package behavioral.command;

public class RemoteController implements Controller {

	@Override
	public void execute(Command cmd) {
		cmd.execute();
		System.out.println("command " + cmd.getClass().getSimpleName() + " is executed");
	}

}
