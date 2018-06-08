package behavioral.iterator;

import java.util.Iterator;

/**
 * An iterator is used to traverse a container and access the container's elements.
 * The iterator pattern decouples algorithms from container; in some cases, algorithms
 * are necessarily container-specific and thus cannot be decoupled
 * 
 * It presents a way to access the elements of an object without exposing the underlying
 * presentation
 * 
 * @author Jason
 *
 */

public class IteratorTest {

	public static void main(String args[]) {
		StationList sl = new StationList();
		
		sl.add(new RadioStation(98));
		sl.add(new RadioStation(100));
		sl.add(new RadioStation((float) 201.0));
		
		Iterator<RadioStation> it = sl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		sl.remove(100.0);
	}
}
