package structural.decorator;

/**
 * Decorator pattern lets you dynamically change the behavior of an object at run time
 * by wrapping them in an object of a decorator class
 * 
 * In object oriented programming, the decorator pattern is a design pattern that
 * allows behavior to be added to an individual object either statically or dynamically,
 * without affecting the behavior of other objects from the same class.
 * 
 * The decorator pattern is often useful for adhering to the single responsibility principle,
 * as it allows functionality to be divided between classes with unique areas of concern
 * 
 * @author Jason
 *
 */

public class CoffeeShop {
	
	public static void main(String[] args) {
		Coffee simple = new SimpleCoffee();
		
		Coffee honey = new HoneyCoffee(simple);
		System.out.println(honey.getCost());
		System.out.println(honey.getDescription());
		
		Coffee milk  = new MilkCoffee(simple);
		System.out.println(milk.getCost());
		System.out.println(milk.getDescription());
		
		Coffee whip = new WhipCoffee(simple);
		System.out.println(whip.getCost());
		System.out.println(whip.getDescription());
	}

}
