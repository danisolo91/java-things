package Exceptions;

public class Exceptions {

	/**
	 * Las excepciones de tipo Exception hay que comprobarlas, es decir, o bien se
	 * envuelven con try catch o bien se propaga con throws.
	 * 
	 * Las excepciones RuntimeException no es obligatorio comprobarlas, pero si no
	 * se comprueban el programa se para cuando ocurre este tipo de excepción, por
	 * eso en este caso no se llega a imprimir "Stop".
	 */
	public static void main(String[] args) {
		System.out.println("Start");

		// Checked exception
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("First exception thrown");

		// Unchecked exception
		test2();

		System.out.println("Stop");
	}

	// Ex: IOException, ParseException, etc.
	private static void test() throws Exception {
		throw new Exception("Checked exception");
	}

	// Ex: NullPointerException, IndexOutOfBoundsException,
	// IllegalArgumentException, etc.
	private static void test2() {
		throw new RuntimeException("Unchecked exception");
	}
}
