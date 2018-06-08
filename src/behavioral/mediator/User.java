package behavioral.mediator;

public class User {
	private String name;
	private ChatMediator mediator;
	
	public User(String name, ChatMediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void sendMessage(String msg) {
		this.mediator.showMessage(this, msg);
	}
}
