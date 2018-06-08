package structural.adapter;

public class AnimalHunter implements Hunter {

	@Override
	public void hunt(Lion lion) {
		lion.roar();
	}
	
}
