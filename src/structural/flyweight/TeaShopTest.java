package structural.flyweight;

public class TeaShopTest {
	
	public static void main(String args[]) {
		TeaMaker maker = new TeaMaker();
		maker.make("GreenTea");
		
		TeaShop shop = new TeaShop(maker);
		shop.takeOrder("GreeTea", 1);
		shop.takeOrder("GreeTea", 3);
		shop.takeOrder("GreeTea", 5);
		
		shop.serve();
	}

}
