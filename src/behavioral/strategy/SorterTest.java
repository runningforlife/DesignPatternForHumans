package behavioral.strategy;

import java.util.Arrays;

/**
 * the strategy pattern(also known as policy pattern) is a behavioral pattern that 
 * enables an algorithm's behavior to be selected at runtime
 * 
 * 
 * @author Jason
 *
 */
public class SorterTest {
	
	public static void main(String args[]) {
		//int[] data = {1, 4, 39, 23, 3, 9, 20};
		
		Sorter bubble = new Sorter(new BubbleSort());
		bubble.sort(Arrays.asList(1, 4, 39, 23, 3, 9, 20));
		
		Sorter quick = new Sorter(new QuickSort());
		quick.sort(Arrays.asList(1, 4, 39, 23, 3, 9, 20));
	}
}
