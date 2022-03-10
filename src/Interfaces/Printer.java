package Interfaces;

@FunctionalInterface
public interface Printer {

	void print(String message);
	
	// Bad practice
	default void printTwice(String message) {
		System.out.println(message);
		System.out.println(message);
	}
	
}
