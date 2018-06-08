package structural.bridge;

public class DarkTheme implements Theme {

	@Override
	public String getColor() {
		return "Dark Black";
	}

	@Override
	public int getFontSize() {
		return 16;
	}
	
	@Override
	public String toString() {
		return "color=Dark Black," + 
				"font size=16";
	}

}
