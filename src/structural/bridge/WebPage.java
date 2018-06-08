package structural.bridge;

public abstract class WebPage {
	Theme mTheme;
	
	public WebPage(Theme theme) {
		mTheme = theme;
	}
	
	public abstract void getContent();
}
