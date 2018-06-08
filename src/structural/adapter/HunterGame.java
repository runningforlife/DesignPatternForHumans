package structural.adapter;

public class HunterGame {
	
	public static void main(String args[]) {
		DogAdapter adapter = new DogAdapter(new WildDog());
		
		Hunter hunter = new AnimalHunter();
		hunter.hunt(adapter);
		
		hunter.hunt(new AsianLion());
	}
}
