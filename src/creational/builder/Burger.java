package creational.builder;

public class Burger {
	private static int DEFAULT_SIZE = 10;
	
	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean lettuce;
	private boolean tomato;
	private boolean pepper;
	
	public static final class BurgerBuilder {
		private Burger burger;
		
		public BurgerBuilder() {
			burger = new Burger(DEFAULT_SIZE);
		}
		
		public BurgerBuilder(int size) {
			burger = new Burger(size);
		}
		
		public BurgerBuilder addCheese() {
			burger.addCheese();
			return this;
		}
		
		public BurgerBuilder addPepperoni() {
			burger.addPepperoni();
			return this;
		}
		
		public BurgerBuilder addLettuce() {
			burger.addLettuce();
			return this;
		}
		
		public BurgerBuilder addTomato() {
			burger.addTomato();
			return this;
		}
		
		public BurgerBuilder addPepper() {
			burger.addPepper();
			return this;
		}
		
		Burger build() {
			return burger;
		}
	}
	
	Burger(int size) {
		this.size = size;
	}
	
	void addCheese() {
		this.cheese = true;
	}
	
	void addPepperoni() {
		this.pepperoni = true;
	}
	
	void addLettuce() {
		this.lettuce = true;
	}
	
	void addTomato() {
		this.tomato = true;
	}
	
	void addPepper() {
		this.pepper = true;
	}
	
	@Override
	public String toString() {
		return "burger size=" + size
				+ "\nhas cheese=" + cheese
				+ "\nhas pepperoni=" + pepperoni 
				+ "\nhas lettuce=" + lettuce
				+ "\nhas tomato=" + tomato
				+ "\nhas peper=" + pepper;
	}
}
