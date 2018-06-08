package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TeaShop {
	protected Map<Integer, GreenTea> orders;
	protected TeaMaker teaMaker;
	
	public TeaShop(TeaMaker maker) {
		this.teaMaker = maker;
		orders = new HashMap<>();
	}
	
	public void takeOrder(String teaType, int table) {
		this.orders.put(table,this.teaMaker.make(teaType));
	}
	
	public void serve() {
		Set<Map.Entry<Integer, GreenTea>> entries = orders.entrySet();
		for (Map.Entry<Integer, GreenTea> entry : entries) {
			System.out.println("servering tea to table#=" + entry.getKey());
		}
	}

}
