package creational.prototype;

/**
 * @When to use
 * an object is required that is similar to existing object or when the creation
 * would be expensive as compared to cloning
 * 
 * @author Jason
 *
 */
public class CloneSheep {
	
	public static void main(String[] args) {
		Sheep sheep = new Sheep("Chichi", (float) 40.0, "Mountain Sheep");
		
		System.out.println(sheep);
		
		try {
			Sheep dolly = (Sheep) sheep.clone();
			dolly.setName("dolly");
			System.out.println(dolly);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
