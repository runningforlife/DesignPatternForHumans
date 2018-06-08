package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsReader implements Observer {
	private String name;
	
	public NewsReader(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("news source=" + o + ", news=" + arg);
	}
	
	
}
