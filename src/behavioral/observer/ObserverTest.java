package behavioral.observer;

/**
 * The observer pattern is a pattern in which an object called the subject, 
 * maintains a list of its dependents called observers, and notifies them 
 * automatically of any state changes 
 * 
 * @author Jason
 *
 */

public class ObserverTest {
	
	public static void main(String args[]) {
		NewsReader bob = new NewsReader("Bob");
		NewsReader dylan = new NewsReader("Dylan");
		
		WebNews wn = new WebNews();
		wn.addObserver(bob);
		wn.addObserver(dylan);
	
		wn.sendNews("trade war is being triggered between US & CN");
	}

}
