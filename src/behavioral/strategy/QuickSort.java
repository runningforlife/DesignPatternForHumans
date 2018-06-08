package behavioral.strategy;

import java.util.List;

public class QuickSort implements SortStrategy {

	@Override
	public void sort(List<Integer> dataset) {
		System.out.println("Quick sorting strategy");
	}

}
