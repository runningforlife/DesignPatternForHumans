package structural.flyweight;

import java.util.HashMap;

public class TeaMaker {
	protected HashMap<String, GreenTea> availableTea;
	
	public TeaMaker() {
		availableTea = new HashMap<>();
	}
	
	public GreenTea make(String teaType) {
		if (availableTea.get(teaType) == null) {
			availableTea.put(teaType, new GreenTea());
		}
		
		return availableTea.get(teaType);
	}

}
