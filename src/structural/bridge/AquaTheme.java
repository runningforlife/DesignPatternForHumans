package structural.bridge;

public class AquaTheme implements Theme {

	@Override
	public String getColor() {
		return "Light Blue";
	}

	@Override
	public int getFontSize() {
		return 15;
	}
	
	@Override
	public String toString() {
		return "color=Light Blue" + 
				"font size=15";
	}

}
