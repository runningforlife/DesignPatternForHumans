package structural.bridge;

public class Article extends WebPage {

	public Article(Theme theme) {
		super(theme);
	}
	
	@Override
	public void getContent() {
		System.out.println("\nthis is article page");
		System.out.println(mTheme);
	}

}
