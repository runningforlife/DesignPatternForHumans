package behavioral.iterator;

public class RadioStation {
	protected float frequency;
	
	public RadioStation(float frequency) {
		this.frequency = frequency;
	}
	
	public float getFrequency() {
		return this.frequency;
	}
	
	@Override
	public String toString() {
		return "radio frequency=" + this.frequency;
	}
}
