package behavioral.strategy;

import java.util.List;

public class BubbleSort implements SortStrategy {

	@Override
	public void sort(List<Integer> dataset) {
		System.out.println("Bubble sorting strategy");
	}
}
