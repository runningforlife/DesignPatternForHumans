package behavioral.chainofresponsibility;

/**
 * the-chain-of-responsibility pattern is a design pattern consisting of a source 
 * of command objects and a series of processing objects. Each processing contains
 * logic that defines the types of command objects that it can handle; the rest are
 * passed to the next processing object in the chain.
 * 
 * it helps building a chain of objects. Request enters from one end and keeps going from
 * object to object till it finds the suitable handler.
 * 
 * @author Jason
 *
 */

public class AccountPayPriority {

	public static void main(String args[]) {
		CreditCard cc = new CreditCard(200);
		Alipay ap = new Alipay(300);
		WechatPay wp = new WechatPay(350);
		ABCBank abc = new ABCBank(500);
		
		cc.setNext(ap);
		ap.setNext(wp);
		wp.setNext(abc);
		
		try {
			cc.pay(310);
			cc.pay(410);
		} catch (BalanceException e) {
			System.err.println("no enough money, fail to pay");
		}
	}
}
