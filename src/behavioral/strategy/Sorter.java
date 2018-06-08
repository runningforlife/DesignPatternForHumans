package behavioral.strategy;

import java.util.List;

public class Sorter {
	private SortStrategy sorterStrategy;
	
	public Sorter(SortStrategy strategy) {
		this.sorterStrategy = strategy;
	}

	public void sort(List<Integer> dataset) {
		this.sorterStrategy.sort(dataset);
	}
}
