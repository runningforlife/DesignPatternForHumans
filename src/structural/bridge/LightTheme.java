package structural.bridge;

public class LightTheme implements Theme {

	@Override
	public String getColor() {
		return "off White";
	}

	@Override
	public int getFontSize() {
		return 14;
	}

	@Override
	public String toString() {
		return "color= off white" + 
				",font size=" + 14;
	}
}
