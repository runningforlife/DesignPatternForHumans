package behavioral.chainofresponsibility;

public class BalanceException extends Exception {
	private static final long serialVersionUID = 3180900348466101982L;

	public BalanceException() {
		super("No enough mony to pay");
	}
}
