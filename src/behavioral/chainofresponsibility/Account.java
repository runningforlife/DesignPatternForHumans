package behavioral.chainofresponsibility;

public class Account {
	private Account next;
	
	protected float balance;
	
	public Account(float balance) {
		this.balance = balance;
	}
	
	public void setNext(Account next) {
		this.next = next;
	}
	
	public boolean canPay(float amount) {
		return balance >= amount;
	}
	
	public void pay(float payAmount) throws BalanceException {
		if (this.canPay(payAmount)) {
			this.balance -= payAmount;
			System.out.println("Paid " + payAmount + " using " + this.getClass().getSimpleName());
			System.out.println("current balance=" + this.balance);
		} else if (this.next != null) {
			System.out.println("cannot pay use " + this.getClass().getSimpleName() + ", try "
					+ this.next.getClass().getSimpleName());
			this.next.pay(payAmount);
		} else {
			throw new BalanceException();
		}
	}
}
