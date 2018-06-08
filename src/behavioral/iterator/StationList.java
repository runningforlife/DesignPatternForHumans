package behavioral.iterator;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StationList extends AbstractCollection<RadioStation> {
	private static final int MAX_STATIONS_CAP = 100;
	
	private RadioStation[] stations;
	private int stationCount = 0;
	
	public StationList() {
		this.stations = new RadioStation[MAX_STATIONS_CAP];
	}

	public boolean add(RadioStation rs) {
		if (rs == null) return false;
		
		this.stations[stationCount++] = rs;
		return true;
	}
	
	public RadioStation remove(float frequency) {
		
		for (int i = 0; i < stationCount; ++i) {
			if (stations[i].getFrequency() == frequency) {
				return remove(i);
			}
		}
		
		return null;
	}

	public RadioStation remove(int idx) {
		if (idx >= stationCount) 
			throw new ArrayIndexOutOfBoundsException();
		
		RadioStation oldItem = stations[idx];
		
		int numMoved = stationCount - idx - 1;
		if (numMoved > 0) {
			System.arraycopy(stations, idx + 1, stations, idx, numMoved);
		}
		
		stations[--stationCount] = null; // help GC
		
		return oldItem;
	}
	
	@Override
	public Iterator<RadioStation> iterator() {
		return new Itr();
	}

	@Override
	public int size() {
		return this.stations.length;
	}

	private final class Itr implements Iterator<RadioStation> {
		private int cursor;
		private int lastRet = -1;

		@Override
		public boolean hasNext() {
			return cursor != stationCount;
		}

		@Override
		public RadioStation next() {
			int i = cursor;
			if (i >= size()) {
				throw new NoSuchElementException();
			}
			
			cursor = i + 1;
			
			return stations[lastRet = i];
		}

		@Override
		public void remove() {
			if (lastRet == -1) {
				throw new IllegalArgumentException();
			}
			
			StationList.this.remove(lastRet);
			cursor = lastRet;
			lastRet = -1;
		}
		
	}
}
