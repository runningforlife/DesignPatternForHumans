package creational.singleton;

/**
 * the singleton pattern restricts the instantiation of a class to one object.
 * This is useful when exactly one object is needed to coordinate actions across
 * the system. Singleton should be used with caution for below reasons:
 * 
 * 1. it introduces a global state in you application and change it in one place could
 * affect in the other areas and it could become pretty difficult to debug
 * 2. it makes your code tightly coupled plus mocking the singleton could be difficult
 * 3. In multiple thread, careful synchronization is need to keep singleton state consistent
 * for concurrent access
 * 
 * @author Jason
 *
 */

public final class President {
	private static President sInstance;
	
	public static President getInstance() {
		if (sInstance == null) {
			sInstance = new President();
		} 
		
		return sInstance;
	}
}
