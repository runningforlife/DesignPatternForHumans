package behavioral.mediator;

public class ChatRoom implements ChatMediator {

	@Override
	public void showMessage(User user, String msg) {
		System.out.println("user=" + user.getName() + ", message="+ msg);
	}

}
