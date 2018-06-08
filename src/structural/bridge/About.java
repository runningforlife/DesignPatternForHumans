package structural.bridge;

public class About extends WebPage {
	
	public About(Theme theme) {
		super(theme);
	}
	
	@Override
	public void getContent() {
		System.out.println("\nthis is about page");
		System.out.print(mTheme);
	}

}
