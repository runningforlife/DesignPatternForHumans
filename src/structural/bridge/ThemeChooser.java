package structural.bridge;

/**
 * Bridge pattern is about preferring composition over inheritance. Implementation details
 * are pushed from a hierarchy to another object with a separate hierarchy
 *
 * which means that it can decouple an abstraction from its implementation so that the two
 * can vary independently
 * 
 * 
 * @author Jason
 *
 */

public class ThemeChooser {
	
	public static void main(String args[]) {
		Theme acqua = new AquaTheme();
		WebPage about = new About(acqua);
		
		about.getContent();
		
		Theme light = new LightTheme();
		WebPage article = new Article(light);
		
		article.getContent();
	}

}
