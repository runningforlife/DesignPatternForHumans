package creational.builder;

import creational.builder.Burger.BurgerBuilder;

/**
 * @When to use
 * 
 * there could be several flavors of an object and to avoid the constructor
 * telescoping. The key difference from the factory is that: factory pattern
 * is to be used when the creation is a one step process while builder pattern 
 * is to be used when the creation is a multiple step process
 * 
 * @author Jason
 *
 */

public class BurgerShop {
	
	public static void main(String[] args) {
		BurgerBuilder builder = new Burger.BurgerBuilder(20);
		
		Burger burger = builder.addCheese()
				.addLettuce()
				.addTomato()
				.addPepper()
				.build();
		
		System.out.print(burger);
	}

}
