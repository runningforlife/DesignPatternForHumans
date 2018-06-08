package behavioral.observer;

import java.util.Observable;

/**
 * 
 * @author samsung
 *
 */

public class WebNews extends Observable {
	
	
	public void sendNews(String news) {
		this.setChanged();
		this.notifyObservers(news);
		//this.clearChanged();
	}
	
	@Override
	public String toString() {
		return "WebNews";
	}
}
